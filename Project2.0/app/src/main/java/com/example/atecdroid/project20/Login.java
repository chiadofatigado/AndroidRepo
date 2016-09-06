package com.example.atecdroid.project20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import modelo.User;

public class Login extends AppAbs {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    // como não temos acesso a uma base de dados, a unica e exclusiva maneira
    // de obtermos os dados do login é atraves dos dados default estabelecidos na MainActivity

    public void loginClick(View v){
        String tfUser = ((EditText) findViewById(R.id.tfUser)).getText().toString();
        String tfPass = ((EditText) findViewById(R.id.tfPass)).getText().toString();
        // no futuro meter aqui ligações à base de dados
        if(tfUser.equals(root.getUsername()) && tfPass.equals(root.getPassword())) {
            Toast.makeText(this, "Logged Successfully", Toast.LENGTH_SHORT).show();
            // main activity (menus e afins)
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
        else
            Toast.makeText(this, "Login Credentials Incorrect", Toast.LENGTH_SHORT).show();
    }

    public void signUp(View v){
        Intent changeScreen = new Intent(getApplicationContext(),SignUp.class);
        startActivity(changeScreen);
    }
}
