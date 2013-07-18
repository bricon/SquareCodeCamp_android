package com.example.android101.data.response;

import com.example.android101.data.model.User;

/** A special user response which also contains a session ID from logging in. */
public class LogInResponse extends UserResponse {
  public final String session_token;

  public LogInResponse(boolean success, String title, String message, String error_title,
      String error_message, User user, String session_token) {
    super(success, title, message, error_title, error_message, user);
    this.session_token = session_token;
  }
}
