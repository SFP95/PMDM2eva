package com.example.pmdm2eva.cronos.mycrono.Brox_Ponce_Alba_Maria.app.src.main.java.org.abrox.t5_ejemplos.brox_ponce_alba_maria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
/*
public class MainActivity extends AppCompatActivity {
    private TextView _tv;
    private ListView _lv;
    private Cronometro _c;
    private ArrayAdapter _arrayAdapter;
    private List<String> _segundos;
    private Button _b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializar();

    }

    //Inicializo los atributos de clase
    private void inicializar() {
        _tv = findViewById(R.id.tvCrono);
        _lv = findViewById(R.id.lvMaraton);
        _b = findViewById(R.id.btAnotar);
        _segundos = new ArrayList<>();


    }

    //llamo a la Asynctask que se encargara de encapsular la hebra, que comienza el programa y lo cancela.
    public void onComenzar(View view) {
        _c = new Cronometro();
        _c.execute();
        _b.setEnabled(true);

    }

    //Añado un elemento a la lista
    public void onAnotar(View view){
        actualizarLista();
    }



    private void actualizarLista() {

        //Declaro el adapter.
        _arrayAdapter = new MyArrayAdapter(this, _segundos);
        ListView listView = findViewById(R.id.lvMaraton);

        //Añado el valor de ese momento
        _arrayAdapter.add(_tv.getText());
        listView.setAdapter(_arrayAdapter);


    }

    //Metodo para cancelar el programa.
    public void onParar(View view) {
        _c.cancel(true);
        _b.setEnabled(false);

    }

    class Cronometro extends AsyncTask<Void, Void, Void>{

        //Lanza la hebra que ejecuta el metodo del contador.
        @Override
        protected Void doInBackground(Void... voids) {
            implementarCronometro();
            return null;
        }

        //Llamo al metodo para cancelar la app
        @Override
        protected void onCancelled(Void unused) {
            super.onCancelled(unused);
        }

        private void implementarCronometro() {

            float contador = 0;

            while(!isCancelled()){
                _tv.setText(new DecimalFormat("#.00").format(contador/100));
                if(isCancelled())break;//tengo que monitorizar si es cancelada.
                contador ++;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
*/