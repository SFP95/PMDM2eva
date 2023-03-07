package com.example.a102_android_ejercicioexamen;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class secundaria extends AppCompatActivity {

    ListView listView;
    List<Pelicula> listaPeliculas;
    ArrayAdapter<Pelicula> arrayAdapter;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);

        inicializar();

        recogerDatos();
        cargarList();
    }

    private void cargarList() {

        arrayAdapter = new MyArrayAdapter(
                this,
                listaPeliculas
        );
        listView.setAdapter(arrayAdapter);
        listView.setOnItemLongClickListener((parent, view, position, id) -> borrar(position));


    }

    private boolean borrar(int position) {

        arrayAdapter.remove(arrayAdapter.getItem(position));
        listaPeliculas.remove(position);
        return true;
    }

    private void inicializar() {
        listView = findViewById(R.id.listView);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void recogerDatos() {

       Intent intent = getIntent();
      listaPeliculas = (List<Pelicula>) intent.getSerializableExtra("listapeliculas");

      listaPeliculas.forEach(pelicula -> System.out.println(pelicula.getDirector()));
    }
}