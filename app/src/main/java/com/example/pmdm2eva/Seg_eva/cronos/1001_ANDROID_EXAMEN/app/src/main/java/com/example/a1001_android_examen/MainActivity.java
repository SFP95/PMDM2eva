package com.example.a1001_android_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
public class MainActivity extends AppCompatActivity {
    int temporizador = 5;
    TextView tvCuentaAtras;
    ProgressBar pg;
    CuentaAtras cuentaAtras;
    List<String> listaFrases;
    List<Pelicula> listaPeliculas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializar();

        //iniciarCuentaAtrasThread();
    }

    private void inicializar() {
        tvCuentaAtras = findViewById(R.id.tvCuentaAtras);
        cuentaAtras = new CuentaAtras();
        cuentaAtras.execute(temporizador);

    }

   /* private void iniciarCuentaAtrasThread() {

        Thread thread = new Thread(() -> cuentaAtras());
        thread.start();


    }

    private void cuentaAtras() {

        for (int i = temporizador; i >= 0; i--) {

            try {
                Thread.sleep(1000);
                runOnUiThread(() -> actualizarTemporizador());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
        private void actualizarTemporizador () {
        temporizador--;
        tvCuentaAtras.setText(String.valueOf(temporizador));
        }

        private void inicializar () {

            tvCuentaAtras = findViewById(R.id.tvCuentaAtras);
            // cuentaAtras = new CuentaAtras();
            // cuentaAtras.execute(temporizador);


        }*/
/*
   class CuentaAtras extends AsyncTask<Integer, Integer, Void> {

        @Override
        protected void onPreExecute() {
            pg = findViewById(R.id.progressBar);
            pg.setMax(temporizador);

        }

        @Override
        protected Void doInBackground(Integer... integers) {

            leerArchivo();

            for(int i =integers[0]; i>=0; i-- ){
                tvCuentaAtras.setText(String.valueOf(i));
                //esta llamada es para pasarle por parametro al onProgressUpdate
                publishProgress(i);
                //este if es para que el metodo onCancelled finalmente funcione
                if(isCancelled())break;

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

            return null;
        }

       private void leerArchivo() {
           InputStream is = getResources().openRawResource(R.raw.peliculas);
           Scanner scanner = new Scanner(is);
           listaFrases = new ArrayList<String>();

           // Lee el contenido del archivo línea por línea
           while (scanner.hasNextLine()) {
               String line = scanner.nextLine();
               listaFrases.add(line);
           }
           try{
               is.close();
               scanner.close();

           }catch(Exception e){
               System.out.println(e.getMessage());
           }

           /**DE CADA POSICION DEL ARRAY COGER LA FRASE Y HACER SPLIT*/
/*
           listaPeliculas = new ArrayList<Pelicula>();

           for(String frase: listaFrases){

               String[]palabras = frase.split("-");
               Pelicula pelicula = new Pelicula(palabras[0],palabras[1]);
               listaPeliculas.add(pelicula);

           }
       }

       @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            pg.setProgress(values[0]);
        }

        @Override
        protected void onPostExecute(Void unused) {
            super.onPostExecute(unused);
            abrirActivity();
        }

       private void abrirActivity() {


           Intent intent = new Intent(MainActivity.this,secundaria.class);

           intent.putExtra("listapeliculas", (Serializable) listaPeliculas);
           startActivity(intent);
       }

       @Override
        protected void onCancelled() {
            super.onCancelled();
        }
    }

    public void onParar(View view) {
        cuentaAtras.cancel(true);
    }

}*/




