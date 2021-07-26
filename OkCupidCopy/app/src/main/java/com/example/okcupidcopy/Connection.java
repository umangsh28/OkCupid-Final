package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

public class Connection extends AppCompatActivity {
    private TextView mtet1;
    private Button mbn;
    private ImageButton mtb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection);
        mbn=findViewById(R.id.bcn);

        mbn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mtet1=findViewById(R.id.tcn1);
                PreferenceHelper.writeStringToPreference(Connection.this,"con",mtet1.getText().toString());
                Intent intent=new Intent(Connection.this,Preferences.class);
                startActivity(intent);
            }
        });
        mtb2=findViewById(R.id.imageBu);
        mtb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Connection.this,Setting.class);
                startActivity(intent);
                finish();
            }
        });

    }

}