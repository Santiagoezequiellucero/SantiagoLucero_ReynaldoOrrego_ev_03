package com.example.santiagolucero_reynaldoorrego_ev_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class HomeAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void Github(View v)
    {
        ArrayList<String> libros = new ArrayList<String>();

        libros.add("(Elija un libro)");
        libros.add("Farenheith");
        libros.add("Revival");
        libros.add("El Alquimista");
        libros.add("El Poder");
        libros.add("Despertar");

        Intent i = new Intent(this, GithubAct.class);
        i.putExtra("listaLibros", libros);
        startActivity(i);
    }
}