package com.example.android101;

import android.app.Application;
import dagger.ObjectGraph;

/**
 * Our custom application class for Wallet. There will only every be one instance of this class
 * in each process (and unless you explicitly ask otherwise, there's only one process per-app).
 * We use this class to initialize and manage global things like dependency injection.
 */
public class WalletApp extends Application {
  private ObjectGraph objectGraph;

  @Override public void onCreate() {
    super.onCreate();

    // The object graph is what maps dependencies to the injection points (called bindings). It
    // stores everything as a directed-acyclic graph and can be statically validated at compile-time
    // instead of at runtime. This means if something is broken, rather than having the app crash
    // the actual build fails. By the way: Directed-acyclic graph... DAG... Dagger. Get it?
    objectGraph = ObjectGraph.create(new WalletModule(this));
    // Click through to WalletModule to learn more about what it does. Here we're only using one
    // module. You can pass many modules and do advanced things like overriding bindings and even
    // creating multiple object graphs.
  }

  /** Inject the supplied object using the application's object graph. */
  public void inject(Object o) {
    objectGraph.inject(o);
  }
}
