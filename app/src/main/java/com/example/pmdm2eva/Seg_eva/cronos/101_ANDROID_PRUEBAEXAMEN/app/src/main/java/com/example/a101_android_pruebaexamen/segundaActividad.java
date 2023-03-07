package com.example.a101_android_pruebaexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class segundaActividad extends AppCompatActivity {
    
    private  ArrayList<Pelicula> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

        try {
            recibirIntent();
            leerFichero();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void leerFichero() throws IOException, ClassNotFoundException {

        FileInputStream fis;
        fis = openFileInput("peliculas.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fis);
        lista = (ArrayList<Pelicula>) objectInputStream.readObject();

    }

    private void recibirIntent() throws IOException {

        lista = (ArrayList<Pelicula>) getIntent().getSerializableExtra("listaPelicans");
        TextView textView = findViewById(R.id.tvSegunPan);
        escribirFichero();

        mostrarEnTextView(lista, textView);
        


    }

    private void escribirFichero() throws IOException {

        FileOutputStream fos;
        fos = openFileOutput("peliculas.txt", Context.MODE_PRIVATE | Context.MODE_APPEND );
        OutputStreamWriter out;
        out = new OutputStreamWriter(fos);

        for(Pelicula nombre: lista){
            out.write(nombre+"\n");
        }

        out.close();
    }

    private void mostrarEnTextView(ArrayList<Pelicula> lista, TextView textView) {
        String peliculas = null;
        for(Pelicula pelicula : lista){

            peliculas += pelicula.getTitulo()+"/"+pelicula.getDirector();
        }
        textView.setText(peliculas);
    }


}