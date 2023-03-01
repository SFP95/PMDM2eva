package com.example.pmdm2eva.Topo;
/*
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import com.example.pmdm2eva.R;

public class MainActivity extends AppCompatActivity {

    private final int Max_Y = 700;
    private final int Max_X = 900;
    private int _x = 0;
    private int _y = 0;
    private final int TIEMPO_JUEGO = 60;
    private int _tiempo;
    private int _puntuacion;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onComenzar(View view) {
        iniciarPuntuacion();
        desactivarBotonComenzar();
        recalculasPosicionTopo();
        mostrarTopo();
        comenzarCuentaAtras();
    }

    private void iniciarPuntuacion() {
        TextView tvPuntuacion = findViewById(R.id.tvPuntuacion);
        tvPuntuacion.setText("0");
    }

    private void desactivarBotonComenzar() {
        Button b = findViewById(R.id.bComenzar);
        b.setEnabled(false);
    }

    private void comenzarCuentaAtras() {
        iniciarTemporizador();
        Thread t = new Thread(()->cuentaAtras());
        t.start();
    }

    private void iniciarTemporizador() {
        _tiempo = TIEMPO_JUEGO;
        TextView tvTiempo = findViewById(R.id.tvTiempo);
        tvTiempo.setText(_tiempo+"");
    }

    private void cuentaAtras() {
        while (_tiempo != 0){
            try {
                Thread.sleep(1000);
                runOnUiThread(()->actualizarTiempo());
            }catch (InterruptedException e){
                throw  new RuntimeException(e);
            }
        }
    }

    private void actualizarTiempo() {
        _tiempo--;
        if (_tiempo>=0){
            TextView tvReloj = findViewById(R.id.tvTiempo);
            tvReloj.setText(_tiempo+"");
        }else{
            finalizarJuego();
        }
    }

    private void finalizarJuego() {
        activarBotonComenzar();
        ocultarTopo();
        mostrarPuntuacion();
    }

    private void activarBotonComenzar() {
        Button bComenzar = findViewById(R.id.bComenzar);
        bComenzar.setEnabled(true);
    }

    private void ocultarTopo() {
        ImageButton bTopo = findViewById(R.id.bTopo);
        bTopo.setEnabled(false);
        bTopo.setVisibility(View.INVISIBLE);
    }

    private void mostrarPuntuacion() {
        TextView tvPuntuacion = findViewById(R.id.tvPuntuacion);
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("FIN DE LA PARTIDA\n PUNTUACION: "+tvPuntuacion.getText().toString());
        alert.setPositiveButton(android.R.string.ok,null);
        alert.show();
    }

    private void mostrarTopo() {
        ConstraintLayout l = (ConstraintLayout) findViewById(R.id.lPantalla);
        ImageButton bTopo = (ImageButton) findViewById(R.id.bTopo);
        ConstraintSet set = new ConstraintSet();

        set.clone(l);
        set.setMargin(bTopo.getId(),ConstraintSet.START,_x);
        set.setMargin(bTopo.getId(),ConstraintSet.START,_y);
        set.applyTo(l);

        bTopo.setVisibility(View.VISIBLE);
        bTopo.setEnabled(true);
    }

    private void recalculasPosicionTopo() {
        _x = (int) ((Math.random()*Max_X)+1);
        _y = (int) ((Math.random()*Max_Y)+1);
    }

    public void onPulsarTopo(View view) {
        recalculasPosicionTopo();
        mostrarTopo();
        aumentarPuntuacion();
    }

    private void aumentarPuntuacion() {
        TextView tvPuntuacion = findViewById(R.id.tvPuntuacion);
        int puntuacion = Integer.parseInt(tvPuntuacion.getText().toString());
        tvPuntuacion.setText((puntuacion+1)+"");
    }
}*/