package com.example.pmdm2eva;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Partido> partidos;
    private MiPartidoAdapter pa;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        partidos = new ArrayList<>();
        partidos.add(new Partido("Atleti","Madrid",2,0));
        pa = new MiPartidoAdapter(this,partidos);

        ListView lv =findViewById(R.id.listView);

    }

}