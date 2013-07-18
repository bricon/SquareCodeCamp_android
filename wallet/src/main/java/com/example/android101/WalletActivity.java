package com.example.android101;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.example.android101.data.ApiHeaders;
import com.example.android101.ui.LoginActivity;
import javax.inject.Inject;

/**
 * A base class which handles the common nitty-gritty of every screen.
 *
 * - Performs dependency injection.
 * - Checks if the user is logged in. If they are not we kick them off to the login screen.
 */
public abstract class WalletActivity extends Activity {
  @Inject ApiHeaders apiHeaders;

  @Override protected void onCreate(Bundle savedInstanceState) {
    // As you read in DirectoryActivity, Android has a callback-based, managed lifecycle. For every
    // callback that we override, we have to make sure to call into the base class so that it can
    // react to these events before our code.
    super.onCreate(savedInstanceState);

    // Find our custom application class and call its inject method. This will use the object graph
    // to find objects to fulfill all of the @Inject fields. There are two main reasons to do this
    // in a base class:
    // 1. It's ugly boilerplate that's required. Write it once here and forget it.
    // 2. Normal activities don't have to worry about the implementation of dependency injection.
    //    They just add @Inject on a field and by the time their call to super.onCreate returns
    //    the fields are now usable.
    ((WalletApp) getApplication()).inject(this);

    // Check if the user is logged in. We just injected this class in the previous line so it
    // is now usable.
    if (!apiHeaders.hasSession()) {
      // Hey! No session therefore the user is logged out. Punt them to login activity.
      signOut();
    }
  }

  private void signOut() {
    startActivity(new Intent(this, LoginActivity.class));
    // Get rid of this screen. We don't want them to come back to this screen if they hit back.
    finish();
  }

  @Override public boolean onCreateOptionsMenu(Menu menu) {
    menu.add("Sign out").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
      @Override public boolean onMenuItemClick(MenuItem menuItem) {
        apiHeaders.clearSession();
        signOut();
        return true;
      }
    });
    return true;
  }
}
