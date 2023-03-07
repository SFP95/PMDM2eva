package com.example.a101_android_pruebaexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
public class MainActivity extends AppCompatActivity {
    
    private List<String> listaFrases;
    private List<Pelicula>listaPeliculas;
    private ArrayAdapter<Pelicula> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        leerArchivoRaw();

        cargarListView();
    }



    private void leerArchivoRaw() {


        InputStream is = getResources().openRawResource(R.raw.peliculas);
        Scanner scanner = new Scanner(is);
        listaFrases = new ArrayList<String>();

        // Lee el contenido del archivo línea por línea
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            listaFrases.add(line);
        }
        try{
            is.close();
            scanner.close();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        /**DE CADA POSICION DEL ARRAY COGER LA FRASE Y HACER SPLIT*/
/*
        listaPeliculas = new ArrayList<Pelicula>();

        for(String frase: listaFrases){

            String[]palabras = frase.split("-");
            Pelicula pelicula = new Pelicula(palabras[0],palabras[1]);
            listaPeliculas.add(pelicula);

        }

    }

    private void cargarListView() {

        arrayAdapter = new MyArrayAdapter(
                this,
                listaPeliculas
        );

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);
        listView.setEmptyView(findViewById(R.id.emptyListView));

        listView.setOnItemClickListener((parent, view, position, id) -> onPulsacionCorta(position));

        listView.setOnItemLongClickListener((parent, view, position, id) ->onPulsacionLarga(position) );



    }

    private boolean onPulsacionLarga(int position) {

        arrayAdapter.remove(arrayAdapter.getItem(position));

        return true;
    }

    private void onPulsacionCorta(int position) {
        Toast.makeText(this, "HAS PULSADO CORTAMENTE", Toast.LENGTH_SHORT).show();

    }


    public void onOrdnearTitulo(View view) {

        arrayAdapter.sort((pi, pd)->ordenarPorTitulo(pi,pd));


    }

    private int ordenarPorTitulo(Pelicula pi, Pelicula pd) {

        return pi.getTitulo().compareToIgnoreCase(pd.getTitulo());
    }

    public void onOrdenarPorDirector(View view) {
        arrayAdapter.sort((pi,pd)->onOrdenarPorDirector(pi,pd));
    }

    private int onOrdenarPorDirector(Pelicula pi, Pelicula pd) {

        int ordenacion = -1;

        /**SI PELI IZQUERDA ES NULL Y PELI DERECHA ES NULL*//*
        if(pi.getDirector() == null && pd.getDirector() == null){
            ordenacion = pi.getTitulo().compareToIgnoreCase(pd.getTitulo());
        }


        /**SI PELI IZQUERDA ES NULL Y PELI DERECHA NO ES NULL*//*
        if(pi.getDirector() == null && pd.getDirector() != null){
            ordenacion = -1;
        }

        /**SI PELI IZQUERDA NO ES NULL Y PELI DERECHA ES NULL*//*
        if(pi.getDirector() != null && pd.getDirector() == null){
            ordenacion = 1;
        }

        /**SI PELI IZQUERDA NO ES NULL Y PELI DERECHA NO NULL*//*

        if(pi.getDirector() != null && pd.getDirector() != null){

            //SI EL DIRECTOR ES EL MISMO
            if(pi.getDirector().compareToIgnoreCase(pd.getDirector())==0){
                ordenacion = pi.getTitulo().compareToIgnoreCase(pd.getTitulo());
            }else{
                ordenacion = pi.getDirector().compareToIgnoreCase(pd.getDirector());
            }

        }


        return ordenacion;
    }

    public void onAniadirPelicula(View view) {

        EditText et = findViewById(R.id.etAniadir);

        String palabra = et.getText().toString();
        String[]palabras = palabra.split("-");

        listaPeliculas.add(new Pelicula(palabras[0],palabras[1]));
        et.setText("");
        cargarListView();
    }

    public void onIrAOTraVista(View view) {

        Intent intent = new Intent(MainActivity.this, segundaActividad.class);
        intent.putExtra("listaPelicans", (Serializable) listaPeliculas);
        startActivity(intent);





    }
}*/