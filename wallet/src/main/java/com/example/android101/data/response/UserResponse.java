package com.example.android101.data.response;

import com.example.android101.data.model.User;

/** A response which contains the current user object. */
public class UserResponse extends SimpleResponse {
  public final User user;

  public UserResponse(boolean success, String title, String message, String error_title,
      String error_message, User user) {
    super(success, title, message, error_title, error_message);
    this.user = user;
  }
}
