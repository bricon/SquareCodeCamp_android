package com.example.android101.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.android101.R;
import com.example.android101.WalletApp;
import com.example.android101.data.ApiHeaders;
import com.example.android101.data.WalletService;
import com.example.android101.data.request.LogInBody;
import com.example.android101.data.response.LogInResponse;
import com.example.android101.data.response.ServerError;
import javax.inject.Inject;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

import static android.widget.Toast.LENGTH_SHORT;

/** Handle logging in the user. */
public class






        LoginActivity extends Activity {
  @Inject ApiHeaders apiHeaders;
  @Inject WalletService walletService;

  private EditText email;
  private EditText password;
  private Button submit;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    // Inject ourselves. We don't extend from WalletActivity because we are logged out.
    ((WalletApp) getApplication()).inject(this);

    // Create the UI for this activity from the login_activity XML file.
    setContentView(R.layout.login_activity);

    // Find all the controls we declared.
    email = (EditText) findViewById(R.id.login_email);
    password = (EditText) findViewById(R.id.login_password);
    submit = (Button) findViewById(R.id.login_submit);

    // When the submit button is clicked, call the login method with the email/password.
    submit.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        login(email.getText().toString(), password.getText().toString());
      }
    });
  }

  public void login(String email, String password) {
    // Disable the submit button to avoid duplicate presses. Fun fact: this isn't enough to actually
    // de-bounce multiple taps. If you create two input events on the button (quickly tapping) you
    // can queue up two clicks before the first one is processed which causes us to call the server
    // twice. Try this on the first screen in Register or Wallet on Android: Tap two fingers on both
    // the "Sign Up" and "Log In" buttons and release at the exact same time. You'll see one of the
    // two screens. Pressing back will take you to the other screen and then pressing back again
    // will finally return you to the original screen. This works in EVERY Android app. Shenanigans!
    submit.setEnabled(false);

    // Call the server to check the login credentials.
    walletService.login(new LogInBody(email, password), new Callback<LogInResponse>() {
      @Override public void success(LogInResponse logInResponse, Response response) {
        if (logInResponse.success) {
          // It worked! Pass along the session token.
          onSuccess(logInResponse.session_token);
        } else {
          // Didn't work. Pass along the error message.
          onError(logInResponse.getMessage());
        }
      }

      @Override public void failure(RetrofitError error) {
        // Something really didn't work... Pass along the error message.
        ServerError serverError = (ServerError) error.getBodyAs(ServerError.class);
        onError(serverError.message);
      }
    });
  }

  private void onSuccess(String session) {
    // Tell the ApiHeaders about the new session. This value will be persisted on the filesystem
    // automatically (and asynchronously) for future app launches. We only want to login once.
    apiHeaders.setSession(session);

    // Go to the main directory screen.
    startActivity(new Intent(this, DirectoryActivity.class));
    // Get rid of this screen. We don't want to come back to login when we hit back.
    finish();
  }

  private void onError(String message) {
    // Re-enable the submit button.
    submit.setEnabled(true);
    // Show a quick message.
    Toast.makeText(this, message, LENGTH_SHORT).show();
  }
}
