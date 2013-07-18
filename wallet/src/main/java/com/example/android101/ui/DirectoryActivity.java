package com.example.android101.ui;

import android.os.Bundle;
import com.example.android101.WalletActivity;

/**
 * Activities are high-level screens in an app. Similar to pages on a website. Content
 * inside an activity can change based on some state or user interaction. Large changes
 * are easier by just moving to a new activity.
 *
 * This activity is responsible for display the contents of the directory. We'll present it
 * as a large grid of images in the hopes of dazzling and delighting users--er--customers into
 * forking over their cash.
 */
public class DirectoryActivity extends WalletActivity {
  /**
   * Android has a managed lifecycle. The operating system creates and destroys things as the user
   * moves throughout the app. We get callbacks at various states. "onCreate" is the first.
   */
  @Override protected void onCreate(Bundle savedInstanceState) {
    // Call up the base class. This is where we centralize things like dependency injection and
    // checking for a user. Once this is done (and I've done it all for you) it's rarely touched.
    super.onCreate(savedInstanceState);
    // The base class, WalletActivity, might have called finish() if the user was logged out. We
    // need to check that here and bail because they are being shuffled to the login screen.
    if (isFinishing()) return;

    // TODO All the things!
  }
}
