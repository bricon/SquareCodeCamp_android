package com.example.android101.data;

import com.example.android101.data.request.LogInBody;
import com.example.android101.data.response.DirectoryMerchantResponse;
import com.example.android101.data.response.LogInResponse;
import com.example.android101.data.response.SimpleResponse;
import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;

/**
 * Retrofit API endpoint definitions for services used by Wallet.
 *
 * If you want to learn more about the syntax in this file see http://square.github.io/retrofit/
 */
public interface WalletService {
  @POST("/login") //
  void login( //
      @Body LogInBody body, //
      Callback<LogInResponse> cb);

  @GET("/directory/merchants/views/home") //
  void listMerchants( //
      @Query("limit") int limit, //
      Callback<DirectoryMerchantResponse> callback);

  @POST("/tabs/open?auto_tab=false") //
  void openTab( //
      @Query("merchant_id") String merchantId, //
      Callback<SimpleResponse> callback);
}
