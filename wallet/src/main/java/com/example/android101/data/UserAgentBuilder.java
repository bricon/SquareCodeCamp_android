// Copyright 2011 Square, Inc.
package com.example.android101.data;

import android.os.Build;
import java.util.Locale;

/**
 * Constructs user agent string from Square and Android build and device information.
 * <p>
 * Note: This information is sent with all HTTP requests (including Amazon S3). Information that
 * should only go to Square goes in RestAdapter.
 * <p>
 * Example User-Agent header:
 * <pre>
 * com.squareup.square/ea00a91c (Android 4.2; Nexus 4; en_US) Version/2.5.2 rsu rro
 * </pre>
 */
public class UserAgentBuilder {
  private static final String FORMAT = "%s/%s (Android %s; %s %s %s; %s) Version/%s %s";

  private String versionName;
  private String userAgentId;
  private String buildSha;
  private String environment = "";

  /** The version name such as "1.3.2" from {@code AndroidManifest.xml}. */
  public UserAgentBuilder versionName(String versionName) {
    this.versionName = versionName;
    return this;
  }

  /** A unique String such as "com.squareup.square". */
  public UserAgentBuilder userAgentId(String userAgentId) {
    this.userAgentId = userAgentId;
    return this;
  }

  /** The SHA of the application build. */
  public UserAgentBuilder buildSha(String buildSha) {
    this.buildSha = buildSha;
    return this;
  }

  /** Interesting tidbits about the device and its environment. */
  public UserAgentBuilder environment(String environment) {
    this.environment = environment;
    return this;
  }

  /** Assemble the final user agent string from the provided data. */
  public String build() {
    if (versionName == null) {
      throw new IllegalStateException("Version name must not be null.");
    }
    if (userAgentId == null) {
      throw new IllegalStateException("User agent ID must not be null.");
    }
    if (buildSha == null) {
      throw new IllegalStateException("Build SHA must not be null.");
    }
    return String.format(FORMAT, userAgentId, buildSha, Build.VERSION.RELEASE, Build.MANUFACTURER,
        Build.BRAND, Build.MODEL, Locale.getDefault(), versionName, environment);
  }
}
