package com.example.actividadgithub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progreso;
    private ImageButton boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progreso =  (ProgressBar)findViewById(R.id.Pbar);
        boton = (ImageButton)findViewById(R.id.ib);

        progreso.setVisibility(View.INVISIBLE); // deja invisible el pBar

        boton .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Task().execute();
            }
        });
    }
    class Task extends AsyncTask<String, Void, String>
    {

        @Override
        protected void onPreExecute() {
            progreso.setVisibility(View.VISIBLE);

        }
        @Override
        protected String doInBackground(String... strings) {
            for (int i = 1 ; i <= 10; i++)
            {
                try
                {
                    Thread.sleep(1000);

                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }

            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            ArrayList<String> Libro = new ArrayList<String>();

            Libro.add("Farenheith");
            Libro.add("Revival");
            Libro.add("El Alquimista");

            progreso.setVisibility(View.INVISIBLE);
            Intent i = new Intent(getBaseContext(), Github_act.class );
            i.putExtra("listaLibro", Libro);

            startActivity(i);
        }

        public void Github(View v)
    {



        for (int i = 1 ; i <= 10 ; i++){

        try
        {
            Thread.sleep(2000);

        }
        catch (Exception e){
            e.printStackTrace();


        }


        }
    }
    }

}
