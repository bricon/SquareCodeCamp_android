package com.example.android101.data;

import android.content.SharedPreferences;
import android.location.Location;
import retrofit.RequestInterceptor;

public class ApiHeaders implements RequestInterceptor {
  /** The key for storing the user session into shared preferences. */
  private static final String KEY_SESSION = "session";

  private final SharedPreferences prefs;
  private final String userAgent = new UserAgentBuilder() //
      .userAgentId("com.squareup.cardcase.android101")
      .buildSha("beefbeef")
      .versionName("3.0")
      .build();

  private String session;

  public ApiHeaders(SharedPreferences prefs) {
    this.prefs = prefs;

    // Check to see if we have an existing session. On cold launch of the app this will actually
    // block until the value can be read. You should never block your application's main thread on
    // things like reading from the disk or the network, we HAVE to do it here because the app's
    // logic is dependent on knowing whether or not we think that we have a session. In practice,
    // the disk I/O is extremely fast anyways.
    String session = prefs.getString(KEY_SESSION, null);
    if (session != null) {
      // We found a session, set the header in memory so we allow the user to navigate the app and
      // API calls are properly authenticated.
      setSession(session);
    }
  }

  /**
   * Store a session token for use on subsequent API calls. This also persists the value into
   * shared preferences.
   */
  public void setSession(String session) {
    this.session = "Session " + session;

    // Write the new session to the preferences.
    prefs.edit().putString(KEY_SESSION, session).apply();
  }

  /** Clear out the user's session in memory and in the shared preferences. */
  public void clearSession() {
    session = null;

    // Clear out the session in the saved preferences.
    prefs.edit().remove(KEY_SESSION).apply();
  }

  /** Check whether or not the app thinks that it is logged in. */
  public boolean hasSession() {
    return session != null;
  }

  // This method is called for every API request.
  @Override public void intercept(RequestFacade request) {
    // If we have a session token, add it as an "Authorization" header.
    if (session != null) {
      request.addHeader("Authorization", session);
    }

    // A verbose user-agent header gives the server a bunch of device info. This controls a lot of
    // server-side logic and optimizations so we'll just pretend to be Wallet 3.0.
    request.addHeader("User-Agent", userAgent);

    // I really, REALLY hope this doesn't page anyone. Normally we calculate this value using a
    // big ridiculous class.
    request.addHeader("X-Device-Id", "42");

    // Pretend we're always at the Office in SFO.
    request.addHeader("Geo-Position", locationToString(MockData.SQUARE));

    // Covering my ass!
    request.addHeader("Square-On-Call",
        "This API call is FAKE and from Android 101. If you were paged email 'jw'.");
  }

  static String locationToString(Location location) {
    return location == null ? null : location.getLatitude()
        + ";"
        + location.getLongitude()
        + ";"
        + location.getAltitude()
        + " epu="
        + ((int) location.getAccuracy())
        + " hdn="
        + ((int) location.getBearing())
        + " spd="
        + ((int) location.getSpeed())
        + " utc="
        + location.getTime();
  }
}
