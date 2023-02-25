package com.example.pmdm2eva.Ej8_listasNoSeSIGradleCorrupto.T8Ej01.app.src.main.java.org.agaray.pmdm.t8.ej01;
/*
import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Libro> libros;
    private MiArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        libros = new ArrayList<>();

        libros.add(new Libro("Zalacaín el aventurero", "Pío Baroja"));
        libros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes"));
        libros.add(new Libro("La Celestina", "Fernando de Rojas"));
        libros.add(new Libro("Rinconete y Cortadillo", "Miguel de Cervantes"));
        libros.add(new Libro("El Lazarillo de Tormes", null));
        libros.add(new Libro("La Galatea", "Miguel de Cervantes"));
        libros.add(new Libro("La Biblia", null));
        libros.add(new Libro("Cantar del Mio Cid", null));

        /*
        for (int i = 0; i < 100; ++i) {
            libros.add(new Libro("Título"+(i+1),"Autor"+(i+101)));
        }
        */
/*
        aa = new MiArrayAdapter(
                this,
                libros);

        ListView lv = (ListView) findViewById(R.id.listview);

        lv.setOnItemClickListener((parent, view, position, id) -> onPulsacionBreve(position, id));

        lv.setOnItemLongClickListener((parent, view, position, id) -> onPulsacionLarga(position, id));
        lv.setEmptyView(findViewById(R.id.emptyListView));
        lv.setAdapter(aa);

    }

    private void onPulsacionBreve(int position, long id) {
        Toast.makeText(this, "Han pulsado en el elemento (" + position + "," + id + ")", Toast.LENGTH_SHORT).show();
    }

    private boolean onPulsacionLarga(int position, long id) {
        /*
        libros.remove(aa.getItem(position));
        aa.notifyDataSetChanged();
         *//*
        aa.remove(aa.getItem(position));

        Toast.makeText(this, "Se ha borrado el elemento (" + position + "," + id + ")", Toast.LENGTH_SHORT).show();
        return true;
    }

    public void onOrdenarPorTitulo(View v) {
        aa.sort((li, ld) -> compararPorTitulo(li, ld));
    }

    public void onOrdenarPorAutor(View v) {
        aa.sort((li, ld) -> compararPorAutor(li, ld));
    }

    private int compararPorTitulo(Libro li, Libro ld) {
        return li.getTitulo().compareToIgnoreCase(ld.getTitulo());
    }

    public int compararPorAutor(Libro li, Libro ld) {
        int resultAutor = -1;

        if ( li.getAutor() == null && ld.getAutor() == null) {
            resultAutor =  li.getTitulo().compareTo(ld.getTitulo());
        }

        if (li.getAutor() == null && ld.getAutor() != null) {
            resultAutor =  -1;
        }

        if (li.getAutor() != null && ld.getAutor() == null) {
            resultAutor =  1;
        }

        if (li.getAutor() != null && ld.getAutor() != null) {
            if (li.getAutor().compareToIgnoreCase(ld.getAutor()) == 0) {
                resultAutor = li.getTitulo().compareTo(ld.getTitulo());
            } else {
                resultAutor = li.getAutor().compareTo(ld.getAutor());
            }
        }

        return resultAutor;
    }



}

*/
