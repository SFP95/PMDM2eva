package com.example.pmdm2eva;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private final long NUM_PRIMOS=10000000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onMensaje(View view) {
        Toast.makeText(this, "MENSAJE ======>", Toast.LENGTH_SHORT).show();
    }

    public void onLanzar(View view) {
        Thread t = new Thread(() -> calcularPrimos(1,NUM_PRIMOS));
        t.start();
        Thread t1 = new Thread(() -> calcularPrimos(2,NUM_PRIMOS*10));
        t1.start();
        Thread t2 = new Thread(() -> calcularPrimos(3,NUM_PRIMOS/10));
        t2.start();
    }

    private void calcularPrimos(int id, long  i) {
        Log.i("PMDM","Comienza el cálculo "+id);
        long resultado = cuantosPrimos(i);
        Log.i("PMDM","("+id+") Número de primos: "+resultado);
        runOnUiThread(()->mostrarResultado(id,resultado));
    }

    private void mostrarResultado(int id, long resultado) {
        TextView tv = findViewById(R.id.tvMensaje);
        tv.setText("RES("+id+"): "+ resultado);
    }

    private long cuantosPrimos(long limite) {
        long result = 0;
        for (long i = 1; i <= limite; ++i)
            if (esPrimo(i))
                ++result;
        return result;
    }

    private boolean esPrimo(long i) {
        if (i == 1) return false;
        if (i < 4) return true;
        if ((i % 2) == 0 || (i % 3) == 0) return false;
        if (i < 9) return true;
        long n = 5;
        while (n*n <= i && i % n != 0 && i % (n + 2) != 0)
            n += 6;
        return (n*n > i);
    }
}