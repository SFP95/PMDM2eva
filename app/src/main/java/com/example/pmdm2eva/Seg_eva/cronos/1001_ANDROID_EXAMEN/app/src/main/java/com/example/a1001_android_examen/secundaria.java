package com.example.a1001_android_examen;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class secundaria extends AppCompatActivity {
    EditText editText;
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

    private void inicializar() {

        listView = findViewById(R.id.listView);
        editText = findViewById(R.id.etAniadir);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void recogerDatos() {

        Intent intent = getIntent();
        listaPeliculas = (List<Pelicula>) intent.getSerializableExtra("listapeliculas");

        listaPeliculas.forEach(pelicula -> System.out.println(pelicula.getDirector()));
    }

    private void cargarList() {

        arrayAdapter = new MyArrayAdapter(
                this,
                listaPeliculas
        );
        listView.setAdapter(arrayAdapter);
        listView.setOnItemLongClickListener((parent, view, position, id) -> borrar(position));
        listView.setEmptyView(findViewById(R.id.emptyListView));


    }

    private boolean borrar(int position) {

        arrayAdapter.remove(arrayAdapter.getItem(position));
        //listaPeliculas.remove(position);
        return true;
    }


    public void onAniadirPelicula(View view) {
        String palabra = editText.getText().toString();
        String[]palabras = palabra.split("-");

        listaPeliculas.add(new Pelicula(palabras[0],palabras[1]));
        editText.setText("");
        cargarList();



    }

    public void onOrdenarTitulo(View view) {
        arrayAdapter.sort((pi,pd)->ordenarPorTitulo(pi,pd));

    }

    private int ordenarPorTitulo(Pelicula pi, Pelicula pd) {
        return pi.getTitulo().compareToIgnoreCase(pd.getTitulo());
    }

    public void onOrdenarDirector(View view) {
        arrayAdapter.sort((pi,pd)->ordenarPorDirector(pi,pd));

    }

    private int ordenarPorDirector(Pelicula pi, Pelicula pd) {
        int ordenacion = -1;

        /**SI PELI IZQUERDA ES NULL Y PELI DERECHA ES NULL*/
        if(pi.getDirector() == null && pd.getDirector() == null){
            ordenacion = pi.getTitulo().compareToIgnoreCase(pd.getTitulo());
        }


        /**SI PELI IZQUERDA ES NULL Y PELI DERECHA NO ES NULL*/
        if(pi.getDirector() == null && pd.getDirector() != null){
            ordenacion = -1;
        }

        /**SI PELI IZQUERDA NO ES NULL Y PELI DERECHA ES NULL*/
        if(pi.getDirector() != null && pd.getDirector() == null){
            ordenacion = 1;
        }

        /**SI PELI IZQUERDA NO ES NULL Y PELI DERECHA NO NULL*/

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
}