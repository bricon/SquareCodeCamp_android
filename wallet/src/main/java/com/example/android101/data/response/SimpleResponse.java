package com.example.android101.data.response;

import com.example.android101.util.Strings;

/**
 * Square breaks REST semantics in a lot of places by returning a 200 response with an error title
 * and message rather than an appropriate response code. All responses objects extend from this
 * class in order to handle that in a structured way.
 *
 * For even more fun, protocol buffers can't use the "message" key because it's a reserved word.
 * They send errors down in "error_message" and "error_title". The {@link #getMessage()} and
 * {@link #getTitle()} do the switching logic to return the appropriate one.
 */
public class SimpleResponse {
  public final boolean success;
  private final String title;
  private final String message;
  private final String error_title;
  private final String error_message;

  public SimpleResponse(boolean success, String title, String message, String error_title,
      String error_message) {
    this.success = success;
    this.title = title;
    this.message = message;
    this.error_title = error_title;
    this.error_message = error_message;
  }

  /** Returns the user-visible error message, or {@code null} if none was received. */
  public String getMessage() {
    return Strings.isBlank(message) ? error_message : message;
  }

  /** Returns the user-visible error title, or {@code null} if none was received. */
  public String getTitle() {
    return Strings.isBlank(title) ? error_title : title;
  }
}
