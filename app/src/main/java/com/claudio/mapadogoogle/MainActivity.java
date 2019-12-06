package com.claudio.mapadogoogle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText lat, log;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lat = findViewById(R.id.latitude);
        log = findViewById(R.id.longitude);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String la= lat.getText().toString();
                String lo= log.getText().toString();
                Intent i = new Intent(getApplicationContext(),MapsActivity.class);
                i.putExtra("latlog",la);
                i.putExtra("loglat",lo);
                startActivity(i);
            }
        });



    }
}
