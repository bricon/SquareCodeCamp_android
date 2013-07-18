package com.example.android101.data.model;

public class User {
  public final String id;
  public final String name;
  public final String email;
  public final boolean show_banner_overlay;

  public final Images image;
  public final CuratedImage curated_image;
  public final LatLong location;

  public User(String id, String name, String email, boolean show_banner_overlay, Images image,
      CuratedImage curated_image, LatLong location) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.show_banner_overlay = show_banner_overlay;
    this.image = image;
    this.curated_image = curated_image;
    this.location = location;
  }

  public String getCuratedUri() {
    return curated_image != null ? curated_image.getPreferredUri() : null;
  }
}
