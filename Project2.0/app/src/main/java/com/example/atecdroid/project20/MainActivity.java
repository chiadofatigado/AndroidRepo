package com.example.atecdroid.project20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import modelo.Linguagem;
import modelo.Tutorial;
import modelo.User;

public class MainActivity extends AppAbs {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Exit(View v){
        Intent logout = new Intent(this, Login.class);
        startActivity(logout);
    }

    public void languageClicked(View v)
    {
        final TextView tv = (TextView)v;
        String linguagem = tv.getText().toString();
        Toast.makeText(this, linguagem, Toast.LENGTH_SHORT).show();

        //array list com linguagens disponiveis



        //ir para uma activity diferente consoante o que foi pressionado
        //deixar tudo limpo
        //linguagens.add(new Linguagem("Java", "A programmer had a problem. He decides to use Java. He now has a ProblemFactory (pun)", "0.0.1"));
        //linguagens.add(new Linguagem("Python", "Python é a evolução final do Java", "0.0.1"));
        //linguagens.add(new Linguagem("C++", "C++ é o arquiteto do matrix", "99.99.1"));
        //linguagens.add(new Linguagem("PHP", "Quando a vida parecer confusa, programa em PHP. A tua vida vai se tornar simples.", "0.0.1"));

        Intent i;
        switch(linguagem)
        {
            case "Java":
                //carregar tutoriais (definidos na classe AppAbs)
                //linguagens.add(new Linguagem("Java", "A programmer had a problem. He decides to use Java. He now has a ProblemFactory (pun)", "0.0.1"));
                //(linguagens.get(0)).addElement(java1);
                //(linguagens.get(0)).addElement(java2);
                i = new Intent(this, ListToturial.class);
                i.putExtra("pos", 0);
                startActivity(i);
                        break;
            case "Python":
                //linguagens.add(new Linguagem("Python", "Python é a evolução final do Java", "0.0.1"));
                //(linguagens.get(1)).addElement(python1);
                //(linguagens.get(1)).addElement(python2);
                i = new Intent(this, ListToturial.class);
                i.putExtra("pos", 1);
                startActivity(i);
                    break;
            case "C++":
                //linguagens.add(new Linguagem("C++", "C++ é o arquiteto do matrix", "99.99.1"));
                //(linguagens.get(2)).addElement(cpp1);
                //(linguagens.get(2)).addElement(cpp2);
                i = new Intent(this, ListToturial.class);
                i.putExtra("pos", 2);
                startActivity(i);
                    break;
            case "PHP":
                //linguagens.add(new Linguagem("PHP", "Quando a vida parecer confusa, programa em PHP. A tua vida vai se tornar simples.", "0.0.1"));
                //(linguagens.get(3)).addElement(php1);
                //(linguagens.get(3)).addElement(php2);
                i = new Intent(this, ListToturial.class);
                i.putExtra("pos", 3);
                startActivity(i);
                    break;
            default: break;
        }
    }
}
