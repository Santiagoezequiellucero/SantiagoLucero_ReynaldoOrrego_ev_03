 package com.example.santiagolucero_reynaldoorrego_ev_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import Clases.Precios;

 public class GithubAct extends AppCompatActivity {
    private Spinner spinner;
    private TextView valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github);

        spinner = (Spinner)findViewById(R.id.spinner);
        valor = (TextView)findViewById(R.id.txtValor);


        ArrayList<String> listaLibros = (ArrayList<String>)getIntent().getSerializableExtra("listaLibros");

        ArrayAdapter<String> adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaLibros);
        spinner.setAdapter(adapt);



    }

    public void Consultar (View v)
    {
        String libros = spinner.getSelectedItem().toString();
        Precios pc = new Precios();


        if (libros.equals("Farenheith")) {
            valor.setText("El precio de farenheith es: " + pc.getFarenheith());
        }
        if (libros.equals("Revival")) {
            valor.setText("El precio de Revival es: " + pc.getRevival());
        }
        if (libros.equals("El Alquimista")) {
            valor.setText("El precio de El Alquimista es: " + pc.getElAlquimista());
        }
        if (libros.equals("(Elija un libro)")) {
            valor.setText("Ningun libro ha sido seleccionado" );
        }
    }

}