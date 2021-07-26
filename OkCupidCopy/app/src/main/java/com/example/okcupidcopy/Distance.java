package com.example.okcupidcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Distance extends AppCompatActivity {

    private EditText mtext1;
    private Button mbx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);
        mtext1=findViewById(R.id.spDis);
        mbx=findViewById(R.id.bx1);
        mbx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PreferenceHelper.writeIntToPreference(Distance.this,"dis", Integer.parseInt(mtext1.getText().toString()));
                Intent intent=new Intent(Distance.this,Preferences.class);
                startActivity(intent);
                finish();
            }
        });
       //
    }
}