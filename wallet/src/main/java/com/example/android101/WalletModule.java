package com.example.android101;

import android.content.SharedPreferences;
import android.util.Log;

import com.example.android101.data.ApiHeaders;
import com.example.android101.data.WalletService;
import com.example.android101.ui.DirectoryActivity;
import com.example.android101.ui.LoginActivity;
import com.example.android101.ui.MerchantActivity;
import com.squareup.okhttp.OkHttpClient;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.inject.Singleton;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import dagger.Module;
import dagger.Provides;
import retrofit.RestAdapter;
import retrofit.client.OkClient;

import static android.content.Context.MODE_PRIVATE;

// Modules are classes whose methods provide bindings to objects. They are meant to be composed
// together to fulfill the entire requirements of your applications injections.
@Module(
        // A list of things we need to inject. Due to how Dagger and incremental compilers work we have
        // to create a list of target objects we will inject using this module. While useful for large,
        // modular projects (like Wallet was and Register is), it's really annoying in small, single-
        // module projects like this one. Dagger 2.0 is slated to eliminate this requirement altogether.
        injects = {
                LoginActivity.class,
                DirectoryActivity.class,
                MerchantActivity.class
        })
public class WalletModule {
    // Keep a reference to the application which created us.
    private final WalletApp app;

    public WalletModule(WalletApp app) {
        this.app = app;
    }

    /**
     * Create the global request headers object which also manages the user's session token.
     */
    @Provides
    @Singleton
    ApiHeaders provideApiHeaders() {
        // About the method declaration...

        // @Provides:  Indicates to Dagger that this method provides instances of a specific type.
        // @Singleton: Denotes that we only need to construct one instance and can re-use it everywhere.
        // ApiHeaders: The object type for which this method binds.

        // Shared preferences are an Android-provided convenience for storing lightweight things. We
        // use them to persist the user session token so that you stay logged in between app launches.
        // Because you need an activity or application to get to shared preferences we pass in the
        // creating application to the module's constructor and then store it for when this method is
        // called.
        SharedPreferences preferences = app.getSharedPreferences("Wallet", MODE_PRIVATE);
        // Create the object and pass in the shared preferences. Because this is annotated with
        // @Singleton, this will be the only one that is created.
        return new ApiHeaders(preferences);
    }

    /**
     * A RestAdapter is a fancy class from Retrofit (http://square.github.io/retrofit/) which takes
     * a Java interface that defines an API and dynamically create an object which implements that
     * interface to make real API calls.
     */
    @Provides
    @Singleton
    RestAdapter provideRestAdapter(OkHttpClient client, ApiHeaders headers) {
        // This method takes two arguments. Dagger will automatically fulfill the arguments required
        // before calling us. ApiHeaders is provided by the previous method and OkHttpClient is declared
        // down below.

        RestAdapter.Builder builder = new RestAdapter.Builder();

        // Declare the base endpoint we will be talking to. We'll use relative URLs from this on all
        // the API definitions that we create.
        builder.setServer("https://api.squareup.com/1.0/");

        // Set the HTTP client that we'll use. Here we are wrapping the raw OkHttpClient from OkHttp
        // in a Retrofit class. Retrofit will pick an HTTP client for us, but we make our own so that
        // we can tweak settings and set things like trusted certificates.
        builder.setClient(new OkClient(client));

        // Our ApiHeaders are a request interceptor. They get to add headers right before every single
        // request is executed. This lets us change headers values for each request with not only the
        // session but things like the user's location and nearby Wi-Fi access points, etc.
        builder.setRequestInterceptor(headers);

        // Enable some logging, since we'll inevitably break something and need to see requests.
        builder.setLogLevel(RestAdapter.LogLevel.FULL);
        builder.setLog(new RestAdapter.Log() {
            @Override
            public void log(String s) {
                Log.d("RETROFIT", s);
            }
        });

        return builder.build();
    }

    /**
     * Create an instance of our API interface whose methods make real API calls!
     */
    @Provides
    @Singleton
    WalletService provideWalletService(RestAdapter restAdapter) {
        // This is pure magic. The RestAdapter from Retrofit takes our API interface and turns it into
        // a real class whose methods make actual API calls. Some real hand-wavy shit happens here.
        //
        // If you know Java, it's just a Proxy that caches annotations for speed. In version 2.0 we're
        // actually going to code-gen implementations of your interfaces since reflections is abysmally
        // slow on Android. How gangster is that?
        return restAdapter.create(WalletService.class);
    }

    /**
     * Create an HTTP client configured to not do any certificate validation.
     */
    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient() {
        // OkHttpClient is neither Apache HttpClient nor Java's HttpUrlConnection. It's a standalone
        // implementation that was forked from the code in the Android OS, updated by Jesse Wilson (and
        // now a few others) with things like SPDY and general performance improvements, and packaged as
        // a standalone library. It implements the HttpUrlConnection interface and has a shim for using
        // with Apache's HttpClient interface.
        OkHttpClient client = new OkHttpClient();
        client.setSslSocketFactory(badSslSocketFactory());
        return client;
    }

    /**
     * Do the devil's work. This creates a socket factory that is used for secure HTTP connections
     * which does NO VERIFICATION of certificates. We use this to talk to staging and our local hosts
     * normally. For production we would normally pin a certificate for that offers guarantees. For
     * the purposes of this app, we'll just always use the one that doesn't do anything.
     * <p/>
     * Don't use this. Like, ever.
     */
    private static SSLSocketFactory badSslSocketFactory() {
        try {
            // Construct SSLSocketFactory that accepts any cert.
            SSLContext context = SSLContext.getInstance("TLS");
            TrustManager permissive = new X509TrustManager() {
                @Override
                public void checkClientTrusted(X509Certificate[] chain, String authType)
                        throws CertificateException {
                }

                @Override
                public void checkServerTrusted(X509Certificate[] chain, String authType)
                        throws CertificateException {
                }

                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
            };
            context.init(null, new TrustManager[]{permissive}, null);
            return context.getSocketFactory();
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }
}
