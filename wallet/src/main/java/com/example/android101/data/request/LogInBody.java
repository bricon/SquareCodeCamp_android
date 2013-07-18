package com.example.android101.data.request;

/**
 * User credentials. This object gets serialized to JSON automatically by Retrofit using Gson. On
 * the wire it looks like: {"email": "bees@oprah.net", "password": "honey"}
 */
public class LogInBody {
  public final String email;
  public final String password;

  public LogInBody(String email, String password) {
    this.email = email;
    this.password = password;
  }
}
