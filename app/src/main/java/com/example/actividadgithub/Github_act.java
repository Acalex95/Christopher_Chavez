package com.example.actividadgithub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import Clases.ValorLibros;

public class Github_act extends AppCompatActivity {

    private Spinner spn;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);

        spn = (Spinner)findViewById(R.id.SpLibros);
        text = (TextView)findViewById(R.id.tv);

        ArrayList<String> listaLibro = (ArrayList<String>) getIntent().getSerializableExtra("listaLibro");

        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaLibro);

        spn.setAdapter(adapt);




    }

    public void Mostrar (View v){

        String libros = spn.getSelectedItem().toString();
        ValorLibros valorLibros = new ValorLibros();
        String lib = valorLibros.getFarenheith();
        String lib1  = valorLibros.getRevival();
        String lib2  = valorLibros.getElAlquimista();


        if (libros.equals("Farenheith")){

            text.setText("El valor de " + libros+ " es: " + lib);
        }
        if (libros.equals("Revival")){

            text.setText("El valor de " + libros + " es: " + lib1);
        }
        if (libros.equals("El Alquimista")){

            text.setText("El valor de " + libros + " es: " + lib2);
        }

    }
}


