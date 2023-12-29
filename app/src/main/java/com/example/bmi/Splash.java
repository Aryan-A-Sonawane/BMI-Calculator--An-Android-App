package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TextView VwBMI=findViewById(R.id.VwBMI);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent toMainfromSplash = new Intent(Splash.this, MainActivity.class);
                startActivity(toMainfromSplash);
                finish();
            }
        }, 4000);


    }
}