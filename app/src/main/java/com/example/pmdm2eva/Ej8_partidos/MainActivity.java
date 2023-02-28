package com.example.pmdm2eva.Ej8_partidos;

import android.annotation.SuppressLint;
import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.pmdm2eva.R;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainActivity extends ListActivity {

    List<Partido> partidos;

    class ListaPartidosAdapter extends ArrayAdapter<Partido>{
        public ListaPartidosAdapter(@NonNull Context context, @NonNull Partido[] partidos) {
            super(context,0,partidos);
        }
        public ListaPartidosAdapter(@NonNull Context context, @NonNull List<Partido> partidos) {
            super(context,0,partidos);
        }

        @SuppressLint("ViewHolder")
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            Partido p = getItem(position);
            View v;
            v = LayoutInflater.from(getContext()).inflate(
                    R.layout.detalle_partido,
                    parent,
                    false);

            TextView local = (TextView) v.findViewById(R.id.local);
            TextView visitante = (TextView) v.findViewById(R.id.visitante);
            TextView res1 = (TextView) v.findViewById(R.id.res1);
            TextView res2 = (TextView) v.findViewById(R.id.res2);

            local.setText(p.getLocal());
            visitante.setText(p.getVisitante());
            res1.setText(""+p.getRes1());
            res2.setText(""+p.getRes2());

            return v;
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciar();
    }

    private void iniciar() {
        cargarDatos();
        setListAdapter(new ListaPartidosAdapter(this,partidos));
    }

    private void cargarDatos(){
        partidos = new ArrayList<>();
        InputStream is = getResources().openRawResource(R.raw.partido);
        Scanner scan = new Scanner(is);
        while (scan.hasNextLine()){
            String linea = scan.nextLine();
            String local = linea.split(",")[0].split("-")[0];
            String visitante = linea.split(",")[0].split("-")[1];
            String res1 = linea.split(",")[1].split("-")[0];
            String res2 = linea.split(",")[1].split("-")[1];
            partidos.add(new Partido(local,visitante,res1,res2));
        }
    }

}