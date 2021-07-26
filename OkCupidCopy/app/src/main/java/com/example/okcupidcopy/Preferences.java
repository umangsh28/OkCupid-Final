package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Preferences extends AppCompatActivity {
    private ImageButton mbtn;
    private ImageButton mbtn1;
    private ImageButton mbtn2;
    private ImageButton mbtn3;
    private ImageButton mbtn4;
    private ImageButton mbtn5;
    private ImageButton mbtn6;
    private ImageButton mbtn7;
    private ImageButton mbtn8;
    private ImageButton mbtn9;
    private ImageButton mbtn10;
    private ImageButton mbtn11;

    private TextView mage;
    private TextView mg1;
    private TextView mdis1;
    private TextView mcon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);
        initViews();
        useintent();
    }

    private void useintent() {
        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Preferences.this,Gender.class);
                startActivity(intent);
                finish();
            }
        });

        mbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Preferences.this,Age.class);
                startActivity(intent);
                finish();
            }
        });
        mbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Preferences.this,Distance.class);
                startActivity(intent);
                finish();
            }
        });
        mbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Preferences.this,Connection.class);
                startActivity(intent);
                finish();
            }
        });


        shared();

    }

    private void shared() {
        String age=PreferenceHelper.getStringFromPreference(Preferences.this,"age");
        mage.setText(age);

        String gender=PreferenceHelper.getStringFromPreference(Preferences.this,"g");
        mg1.setText(gender);

        int distance=PreferenceHelper.getIntFromPreference(Preferences.this,"dis");
        mdis1.setText(distance + "");

        String con=PreferenceHelper.getStringFromPreference(Preferences.this,"con");
        mcon.setText(con);
    }

    private void initViews() {
        mbtn=findViewById(R.id.imageBun);
        mbtn1=findViewById(R.id.imageBun1);
        mbtn2=findViewById(R.id.imageBun2);
        mbtn3=findViewById(R.id.imageBun3);
        mbtn4=findViewById(R.id.imageBun4);
        mbtn5=findViewById(R.id.imageBun5);
        mbtn6=findViewById(R.id.imageBun6);
        mbtn7=findViewById(R.id.imageBun7);
        mbtn8=findViewById(R.id.imageBun8);
        mbtn9=findViewById(R.id.imageBun9);
        mbtn10=findViewById(R.id.imageBun10);
        mbtn11=findViewById(R.id.imageBun11);
        mage=findViewById(R.id.Ag1);
        mg1=findViewById(R.id.g1);
        mdis1=findViewById(R.id.d1);
        mcon=findViewById(R.id.cnx);
    }
}