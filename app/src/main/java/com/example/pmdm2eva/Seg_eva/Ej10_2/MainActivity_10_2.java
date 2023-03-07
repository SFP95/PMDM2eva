package com.example.pmdm2eva.Seg_eva.Ej10_2;
/*
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pmdm2eva.R;

public class MainActivity_10_2 extends AppCompatActivity {
    private final long NUM_PRIMOS = 100000000;

    private CalculaPrimos _cp;

    class CalculaPrimos extends AsyncTask<Long, Integer, Long> {

        private void mostrarResultado(String mensaje) {
            TextView tv = findViewById(R.id.tvMensaje);
            tv.setText(mensaje);
        }

        public boolean esPrimo(long i) {
            if (i == 1) return false;
            if (i < 4) return true;
            if ((i % 2) == 0 || (i % 3) == 0) return false;
            if (i < 9) return true;
            long n = 5;
            while (n * n <= i && i % n != 0 && i % (n + 2) != 0)
                n += 6;
            return (n * n > i);
        }


        public long cuantosPrimos(long limite) {
            long result = 0;
            int progresoAnterior = -1;
            for (long i = 1; i <= limite; ++i)
                if (esPrimo(i)) {
                    result++;
                    if (cambioEnElProgreso(progresoAnterior,i,limite)) {
                        progresoAnterior = porcentajeDeProgreso(i,limite);
                        publishProgress(progresoAnterior);
                    }
                    if (isCancelled()) {
                        return result;
                    }
                }
            return result;
        }

        private Integer porcentajeDeProgreso(long i, long limite) {
            int tamSegmento = (int)limite / 100;
            return (int)(i/tamSegmento);
        }

        private boolean cambioEnElProgreso(int progresoAnterior, long i, long limite) {
            boolean resultado = false;
            int tamSegmento = (int)(limite / 100);
            if (progresoAnterior != i/tamSegmento) {
                resultado = true;
            }
            return resultado;
        }

        @Override
        protected void onProgressUpdate(Integer... progreso) {
            ProgressBar pb = findViewById(R.id.pbProgreso);
            pb.setProgress(progreso[0]);
        }

        @Override
        protected Long doInBackground(Long... parametros) {
            long limite = parametros[0];
            Log.i("PMDM","Calculando num. primos entre 1 y "+limite);
            return cuantosPrimos(limite);
        }

        @Override
        protected void onPostExecute(Long resultado) {
            Log.i("PMDM","Resultado FINAL: "+resultado+" primos");
            mostrarResultado("TOTAL: " + resultado);
            ProgressBar pb = findViewById(R.id.pbProgreso);
            pb.setVisibility(View.INVISIBLE);
            Button bLanzarCancelar = findViewById(R.id.bLanzarCancelar);
            bLanzarCancelar.setText("Lanzar");
        }

        @Override
        protected void onCancelled(Long resultado) {
            Log.i("PMDM","Resultado PARCIAL: "+resultado+" primos");
            mostrarResultado("CANCELADO: Resultado parcial: " + resultado);
        }
    }

    @Override

    // ========================================================================================================

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onMensaje(View v) {
        Toast.makeText(this, "MENSAJE================", Toast.LENGTH_SHORT).show();
    }

    public void onLanzarCancelar(View v) {
        Button b = (Button) v;
        EditText etNumCeros = findViewById(R.id.etNumCeros);
        ProgressBar pbProgreso = findViewById(R.id.pbProgreso);
        switch (b.getText().toString().toLowerCase()) {
            case "lanzar":
                b.setText("Cancelar");
                pbProgreso.setVisibility(View.VISIBLE);
                _cp = new CalculaPrimos();
                _cp.execute( calcularLimitePrimos( etNumCeros.getText().toString() ) );
                break;
            case "cancelar":
                pbProgreso.setVisibility(View.INVISIBLE);
                b.setText("Lanzar");
                _cp.cancel(true);

        }
    }


    private Long calcularLimitePrimos(String numCerosString) {
        long resultado = 1L;
        int numCeros = Integer.parseInt(numCerosString);
        int i=1;
        while (i <= numCeros) {
            resultado *= 10L;
            i++;
        }
        return resultado;
    }
}*/