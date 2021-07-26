package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Setting extends AppCompatActivity {
    private Button mt1;
    private Button mt2;
    private Button mt3;
    private Button mt4;
    private Button mt5;
    private Button mt6;
    private ImageButton mtimgx;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        initView();
        intentuse();
    }

    private void intentuse() {
        mt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://help.okcupid.com/article/79-paid-features";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        mt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Setting.this,Email.class);
                startActivity(intent);
                finish();
            }
        });
        mt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Setting.this,password.class);
                startActivity(intent);
                finish();
            }
        });
        mt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Setting.this,phone_number.class);
                startActivity(intent);
                finish();
            }
        });
        mt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://help.okcupid.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        mt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Setting.this,HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
        mtimgx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Setting.this,Profile.class);
                startActivity(intent);
                finish();
            }
        });


    }

    private void initView() {
        mt1=findViewById(R.id.textView17);
        mt2=findViewById(R.id.textView18);
        mt3=findViewById(R.id.textView19);
        mt4=findViewById(R.id.textView20);
        mt5=findViewById(R.id.textView21);
        mt6=findViewById(R.id.textView22);
        mtimgx=findViewById(R.id.imb1);
    }
}