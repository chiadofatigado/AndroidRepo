package com.example.atecdroid.project20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

class SplashActivity extends AppAbs {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //carregar();
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
        finish();
    }
}