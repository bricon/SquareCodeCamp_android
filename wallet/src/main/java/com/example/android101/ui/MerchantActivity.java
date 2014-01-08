package com.example.android101.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.android101.R;
import com.example.android101.WalletActivity;
import com.example.android101.data.MockData;
import com.example.android101.data.model.User;
import com.example.android101.util.SquaredImageView;
import com.squareup.picasso.Picasso;

/**
 * Created by square on 1/8/14.
 */
public class MerchantActivity extends WalletActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (isFinishing()) return;
        String token = getIntent().getStringExtra("user_token");
        User user = MockData.findUserByToken(token);
        setContentView(R.layout.merchant_activity);

        ImageView imageView = (ImageView)findViewById(R.id.image_view);
        Picasso.with(this).load(user.getCuratedUri())
                .placeholder(R.drawable.app_icon)
                .into(imageView);
        TextView textView = (TextView)findViewById(R.id.merchant_name);
        textView.setText(user.name);

        TextView phoneNumber = (TextView)findViewById(R.id.phone_number);
        textView.setText(user.email);

        Button openTab = (Button)findViewById(R.id.open_tab);

        /*
        Button.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long rowId) {
                User currentUser = user;
                Intent intent = new Intent(MerchantActivity.this, MerchantActivity.class);
                intent.putExtra("user_token", user.id);
                startActivity(intent);
            }
        });
    */;

    }
}
