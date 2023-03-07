package com.example.pmdm2eva.cronos.mycrono.Gomez_Rafael.app.src.main.java.org.rgomez.gomez_rafael;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
/*
public class MainActivity extends AppCompatActivity {
    TextView tvNumeros;
    ListView listView;
    ArrayAdapter arrayAdapter;
    List<Registros> listaDigitos;
    boolean encendido = false;
    float tiempoCronometro;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        incicializar();

        cargarLista();

    }


    private void incicializar() {
        listView = findViewById(R.id.listView);
        tvNumeros = findViewById(R.id.tvCronometro);
        listaDigitos = new ArrayList<Registros>();


    }

    private void cargarLista() {

        arrayAdapter = new MyArrayAdapter(
                this,
                listaDigitos
        );
        listView.setAdapter(arrayAdapter);



    }



    public void onComenzar(View view) {
        encendido = true;

        Thread thread = new Thread(()->cronometro());
        thread.start();
    }
    

    private void cronometro() {

        while(encendido){
            try {
                Thread.sleep(1000);
                runOnUiThread(()->actualizarTemporizador());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        /*for(int i =0; i<=1000; i++){


            try {
                Thread.sleep(10);
                runOnUiThread(()->actualizarTemporizador());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
/*    }

    private void actualizarTemporizador() {
      /*  numDecimales++;

        if(numSegundos<10){
            if(numDecimales>99){
                numSegundos++;
                numDecimales=0;
                tvNumeros.setText("0"+numSegundos+"."+numDecimales);

            }else{
                numSegundos++;
                tvNumeros.setText("0"+numSegundos+"."+numDecimales);
            }

        }else{
            if(numDecimales>99){
                numSegundos++;
                numDecimales=0;
                tvNumeros.setText(numSegundos+"."+numDecimales);

            }else{
                numSegundos++;
                tvNumeros.setText(numSegundos+"."+numDecimales);
            }


        }*/
/*
        tiempoCronometro  ++;
        tvNumeros.setText(String.valueOf(tiempoCronometro));


    }

    public void onAnotar(View view) {

        listaDigitos.add(new Registros(tvNumeros.getText().toString()));
        cargarLista();
    }

    public void onParar(View view) {
        encendido = false;
    }
}

*/