package com.example.android101.data.model;

import com.google.gson.annotations.SerializedName;

public class CuratedImage {

  @SerializedName("original_url") //
  public final String originalUrl;

  @SerializedName("image_576x320_url") //
  public final String largeImageUri;

  @SerializedName("image_286x160_url") //
  public final String smallImageUri;

  public CuratedImage(String originalUrl, String largeImageUri, String smallImageUri) {
    this.originalUrl = originalUrl;
    this.largeImageUri = largeImageUri;
    this.smallImageUri = smallImageUri;
  }

  public String getPreferredUri() {
    if (originalUrl != null) return originalUrl;
    return largeImageUri != null ? largeImageUri : smallImageUri;
  }
}
