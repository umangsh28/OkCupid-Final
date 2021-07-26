package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Email extends AppCompatActivity {
    private TextView mtemail;
    private ImageButton mtb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        mtemail=findViewById(R.id.textView23);
        String email=PreferenceHelper.getStringFromPreference(Email.this,"email");
        mtemail.setText(email);
        mtb2=findViewById(R.id.imageBut);
        mtb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Email.this,Setting.class);
                startActivity(intent);
                finish();
            }
        });

    }
}