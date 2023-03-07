package com.example.pmdm2eva.cronos.mycrono.Assouik_fouad.app.src.main.java.org.fouad.assouik_fouad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
/*
public class MainActivity extends AppCompatActivity {

    private TextView etiq; // Etiqueta para mostrar la información
    private int segundos, minutos, horas; // Segundos, minutos y horas que lleva activo el cronómetro
    private Boolean pausado=false; // Para pausar el cronómetro
    private String salida; // Salida formateada de los datos del cronómetro

    private Button buttonComenzar,btnAnotar,btnPrara;

    MyAsyncTask myAsyncTask;
    List<String> infCaptada=new ArrayList<>();
    CronoAdapter cronoAdapter;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etiq=findViewById(R.id.txtCrono);
        buttonComenzar=findViewById(R.id.btnComenzar);
        listView=findViewById(R.id.listaView);


    }

    public void onCklick(View view) {

        switch (view.getId()){
            case R.id.btnComenzar:
                 myAsyncTask=new MyAsyncTask();
                 myAsyncTask.execute();
                ;break;

            case R.id.btnParar:
                myAsyncTask.cancel(true)
                ;break;

            case R.id.btnAnotar:
                infCaptada.add(etiq.getText().toString());
                cronoAdapter=new CronoAdapter(this,infCaptada);
                listView.setAdapter(cronoAdapter);
                ;break;
        }
    }

    class MyAsyncTask extends AsyncTask<Void,Void,Void>{

        @Override
        protected void onCancelled() {
            super.onCancelled();
        }

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                cronometro();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        private void cronometro() throws InterruptedException {

            while(!pausado) {
                Thread.sleep(10);
                salida = "";
                if (!pausado) {
                    segundos++;
                    if (segundos == 60) {
                        segundos = 0;
                        minutos++;
                    }

                    if (minutos <= 9) {
                        salida += "0";
                    }
                    salida += minutos;
                    salida += ".";
                    if (segundos <= 9) {
                        salida += "0";
                    }
                    if(isCancelled()){
                        break;
                    }
                    salida += segundos;
                }
                etiq.setText(salida);
                System.out.println(salida);
            }
        }
    }
}*/