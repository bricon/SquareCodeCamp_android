package com.example.android101.util;

public class Strings {
  public static boolean isBlank(CharSequence string){
    return (string == null || string.toString().trim().length() == 0);
  }
}
