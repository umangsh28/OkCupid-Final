package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.preference.Preference;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity {
    private Button mtext;
    private Button mtext1;
    private Button mtext2;
    private Button mtext3;
    private Button mtext4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        mtext=findViewById(R.id.tset);
        mtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Profile.this,Setting.class);
                startActivity(intent);
            }
        });
        mtext1=findViewById(R.id.tpre);
        mtext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Profile.this, Preferences.class);
                startActivity(intent1);
            }
        });

        mtext2=findViewById(R.id.textView8);
        mtext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://help.okcupid.com/article/79-paid-features";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        mtext3=findViewById(R.id.textView9);
        mtext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://help.okcupid.com/article/79-paid-features";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        mtext4=findViewById(R.id.textView10);
        mtext4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://help.okcupid.com/article/218-read-receipts#:~:text=You'll%20now%20be%20able,been%20read%20within%20that%20conversation.";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

    }

}