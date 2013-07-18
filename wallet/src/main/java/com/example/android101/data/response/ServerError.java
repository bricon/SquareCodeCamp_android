package com.example.android101.data.response;

/**
 * Square's server's send down a JSON body in this format on HTTP 4XX and even 5XX errors. This
 * gives us a human-readable message to display to the user (most of the time).
 */
public class ServerError {
  public final String message;

  public ServerError(String message) {
    this.message = message;
  }
}
