package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class password extends AppCompatActivity {
    private TextView mp;
    private ImageButton mb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        mp=findViewById(R.id.textView23);
        String pass=PreferenceHelper.getStringFromPreference(password.this,"password");
        mp.setText(pass);
        mb1=findViewById(R.id.imageButton2);
        mb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(password.this,Setting.class);
                startActivity(intent);
            }
        });

    }
}