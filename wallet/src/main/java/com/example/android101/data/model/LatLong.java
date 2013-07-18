package com.example.android101.data.model;

import android.location.Location;

public class LatLong {
  public final double latitude;
  public final double longitude;

  public LatLong(double latitude, double longitude) {
    this.latitude = latitude;
    this.longitude = longitude;
  }

  public Location toLocation() {
    Location location = new Location("gps");
    location.setLatitude(latitude);
    location.setLongitude(longitude);
    return location;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    LatLong latLong = (LatLong) o;

    if (Double.compare(latLong.latitude, latitude) != 0) return false;
    if (Double.compare(latLong.longitude, longitude) != 0) return false;

    return true;
  }

  @Override public int hashCode() {
    int result;
    long temp;
    temp = latitude != +0.0d ? Double.doubleToLongBits(latitude) : 0L;
    result = (int) (temp ^ (temp >>> 32));
    temp = longitude != +0.0d ? Double.doubleToLongBits(longitude) : 0L;
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    return result;
  }
}
