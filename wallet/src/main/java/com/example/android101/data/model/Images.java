package com.example.android101.data.model;

public class Images {
  public final String original_url;
  public final String square60_url;
  public final String square200_url;
  public final String square400_url;

  public Images(String originalImageUrl, String tinyImageUrl, String smallImageUrl,
      String largeImageUrl) {
    this.original_url = originalImageUrl;
    this.square60_url = tinyImageUrl;
    this.square200_url = smallImageUrl;
    this.square400_url = largeImageUrl;
  }

  /** Returns the largest non-null URL, or {@code null} if all URLs are null. */
  public String getLargest() {
    if (square400_url != null) return square400_url;
    if (square200_url != null) return square200_url;
    if (square60_url != null) return square60_url;
    return original_url;
  }
}
