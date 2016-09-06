package com.example.atecdroid.project20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

import modelo.Linguagem;
import modelo.Tutorial;

public class ListToturial extends AppAbs {

    Linguagem lang = null;
    int aux;
    ArrayList<Tutorial> tutorials = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_toturial);

        TextView tit = (TextView) findViewById(R.id.Titulo);
        TextView tv1 = (TextView) findViewById(R.id.Tut1);
        TextView tv2 = (TextView) findViewById(R.id.Tut2);
        Bundle i = getIntent().getExtras();
        aux = i.getInt("pos");
        //Toast.makeText(this, aux, Toast.LENGTH_LONG).show();
        lang = linguagens.get(aux);
        tutorials = lang.getTutorials();

        if(tutorials.isEmpty())
            Toast.makeText(this, "hello", Toast.LENGTH_LONG).show();
        //mostrar tutorials
        tv1.setText(tutorials.get(0).getName());
        tv2.setText(tutorials.get(1).getName());
        //titulo
        tit.setText(lang.getName());

    }

    // onclick list
    public void onClickList(View v)
    {
        TextView tv = (TextView)v;
        //determinar o id da textview que foi pressionada
        String id = v.getResources().getResourceName(v.getId());
        final String substring = id.substring(35);

        if(substring.equals("Tut1"))
        {
            Intent i = new Intent(this, webActivity.class);
            i.putExtra("html", (tutorials.get(0)).getLink());
            startActivity(i);
        }
        if(substring.equals("Tut2"))
        {
            Intent i = new Intent(this, webActivity.class);
            i.putExtra("html", (tutorials.get(1)).getLink());
            startActivity(i);
        }

    }
    public void Exit(View v){
        Intent i = new Intent(this, Login.class);
        startActivity(i);
    }
}
