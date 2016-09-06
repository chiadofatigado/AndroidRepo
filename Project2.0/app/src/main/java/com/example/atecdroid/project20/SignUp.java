package com.example.atecdroid.project20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import modelo.User;

public class SignUp extends AppAbs {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void click(View v){

        String user, pass;

        user = ((EditText) findViewById(R.id.editText1)).getText().toString();
        pass = ((EditText) findViewById(R.id.editText2)).getText().toString();

        // TODO (criar campos para primeiro e ultimo nome)
        User f = new User(user, pass, "teste", "teste");

        Intent changeScreen = new Intent(getApplicationContext(),Login.class);

        changeScreen.putExtra("user",user);
        changeScreen.putExtra("pass",pass);

        startActivity(changeScreen);
    }
}
