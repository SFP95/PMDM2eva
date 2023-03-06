package com.example.pmdm2eva.cronos.mycrono;
/*
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pmdm2eva.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView tvCrono;
    private double horas, mins, seg;
    private boolean pausado = false;
    private String salida;
    private Button bComenzar, bParar, bAnotar;

    MyAsyncTask myAsyncTask;
    List<String> _listaTiempos = new ArrayList<>();
    private CromometroAdapter _crono;
    ListView listView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvCrono = findViewById(R.id.txtCrono);
        bComenzar = findViewById(R.id.btnComenzar);
        listView = findViewById(R.id.listaView);
    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnComenzar:
                myAsyncTask = new MyAsyncTask();
                myAsyncTask.execute();
                break;
            case R.id.btnParar:
                myAsyncTask.cancel(true);
                break;
            case R.id.btnAnotar:
                _listaTiempos.add(tvCrono.getText().toString());
                _crono = new CromometroAdapter(this,_listaTiempos);
                listView.setAdapter(_crono);
                break;
        }
    }


    class MyAsyncTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onCancelled() {
            super.onCancelled();
        }
        @Override
        protected Void doInBackground(Void... voids) {
            try {
                cronometro();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            return null;
        }
        private void cronometro() throws InterruptedException{
            while (!pausado){
                Thread.sleep(10);
                salida = "";
                if (!pausado){
                    seg ++;
                    if (seg == 60){
                        seg = 0;
                        mins++;
                    }
                    if (mins <= 9){
                        salida += "0";
                    }
                    salida += mins;
                    salida += ".";
                    if (seg <=9){
                        salida += "0";
                    }
                    if (isCancelled()){
                        break;
                    }
                    salida += seg;
                }
                tvCrono.setText(salida);
                System.out.printf(salida);
            }
        }
    }
}*/