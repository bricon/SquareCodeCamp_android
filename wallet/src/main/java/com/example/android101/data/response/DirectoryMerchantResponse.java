package com.example.android101.data.response;

import com.example.android101.data.model.User;
import java.util.List;

public class DirectoryMerchantResponse {
  public final List<User> entities;

  public DirectoryMerchantResponse(List<User> entities) {
    this.entities = entities;
  }
}
