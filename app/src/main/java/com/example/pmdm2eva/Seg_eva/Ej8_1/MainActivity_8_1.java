package com.example.pmdm2eva.Ej8_1;
/*
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pmdm2eva.R;

import java.util.ArrayList;

public class MainActivity_8_1 extends AppCompatActivity {
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

        aa = new MiArrayAdapter(this,libros);

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
        aa.remove(aa.getItem(position));

        Toast.makeText(this, "Se ha borrado el elemento (" + position + "," + id + ")", Toast.LENGTH_SHORT).show();
        return true;
    }

    public void onOrdenarPorTitulo(View view) {
        aa.sort((li, ld) -> compararPorTitulo(li, ld));
    }

    public void onOrdenarPorAutor(View view) {
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
}*/