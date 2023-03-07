package com.example.a102_android_ejercicioexamen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
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
    TextView textView;
    CuentaAtras cuentaAtras;
    Button btParar;
    ProgressBar progress;
    List<String> listaFrases;
    List<Pelicula> listaPeliculas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializar();
    }

    private void inicializar() {
        textView = findViewById(R.id.tvSplass);
        cuentaAtras = new CuentaAtras();
        cuentaAtras.execute(temporizador);


    }

    public void onParar(View view) {

        cuentaAtras.cancel(true);
    }

    class CuentaAtras extends AsyncTask<Integer, Integer, Void >{

        /*public CuentaAtras(Context context){
            this.context = context;

        }
        Context context;*/

        //ESTE METODO SE USA CUANDO TERMINA EL DOINBACKGROUND
/*
        @Override
        protected void onPostExecute(Void unused) {
            //alertDialog();

            abrirActivity();

        }

        private void abrirActivity() {

            Intent intent = new Intent(MainActivity.this,secundaria.class);

            intent.putExtra("listapeliculas", (Serializable) listaPeliculas);
            startActivity(intent);




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
        protected void onCancelled() {
            super.onCancelled();
        }

        private void alertDialog() {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Título del diálogo");
            builder.setMessage("Mensaje del diálogo");
            builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    // Acción a realizar al hacer clic en el botón "Aceptar"
                }
            });
            builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    // Acción a realizar al hacer clic en el botón "Cancelar"
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        //este metodo es para setear el porcentaje de la barra
        //este metodo se ejecuta antes de  doinbackground
        @Override
        protected void onPreExecute() {

            progress = findViewById(R.id.progressBar);
            //esto es para setear el maximo de la barra
            progress.setMax(temporizador);

        }
        //este metodo se usa para que la barra de estado se actualice
        @Override
        protected void onProgressUpdate(Integer... values) {

            progress.setProgress(values[0]);
        }

        @Override
        protected Void doInBackground(Integer... integers) {

            leerArchivo();

            //temporizador
            for(int i =integers[0]; i>=0; i--){
                textView.setText(i+" ");
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
    }
}*/