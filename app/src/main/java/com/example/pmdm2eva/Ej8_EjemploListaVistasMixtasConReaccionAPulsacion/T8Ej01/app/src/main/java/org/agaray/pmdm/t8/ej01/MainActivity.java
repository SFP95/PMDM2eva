package org.agaray.pmdm.t8.ej01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Libro> libros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        libros = new ArrayList<>();

        libros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes"));
        libros.add(new Libro("La Celestina", "Fernando de Rojas"));
        libros.add(new Libro("Rinconete y Cortadillo","Miguel de Cervantes"));
        libros.add(new Libro("El Lazarillo de Tormes", null));
        libros.add(new Libro("La Galatea", "Miguel de Cervantes"));
        libros.add(new Libro("La Biblia", null));
        libros.add(new Libro("Cantar del Mio Cid", null));

        for (int i = 0; i < 100; ++i) {
            libros.add(new Libro("Título"+(i+1),"Autor"+(i+101)));
        }

        MiArrayAdapter aa;
        aa = new MiArrayAdapter(
                this,
                libros);

        ListView lv = (ListView) findViewById(R.id.listview);
        lv.setOnItemClickListener((parent, view, position, id)->onPulsacionBreve(position));
        lv.setAdapter(aa);


    }

    private void onPulsacionBreve(int position) {
        Toast.makeText(this, "Han pulsado en el elemento "+position, Toast.LENGTH_SHORT).show();
    }

}