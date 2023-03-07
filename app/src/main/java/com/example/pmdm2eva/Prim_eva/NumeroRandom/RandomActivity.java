package com.example.ej1.NumeroRandom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ej1.R;

import java.util.Random;

public class RandomActivity extends AppCompatActivity {


    private TextView mensaje;
    private Button b;
    private Button b2;
    private EditText edit;
    private Random rnd = new Random();
    int num= rnd.nextInt((100)+1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        b = findViewById(R.id.boton);
        b2 = findViewById(R.id.boton2);
        mensaje = findViewById(R.id.mensaje);
        edit = findViewById(R.id.editt);
    }

    public void pulsar(View v) {
        if(Integer.parseInt(edit.getText().toString()) == num){
            mensaje.setText("Adivinaste");
        }else if(Integer.parseInt(edit.getText().toString()) < num){
            mensaje.setText("Te quedaste corto");
        }else if(Integer.parseInt(edit.getText().toString()) > num){
            mensaje.setText("Te pasaste");
        }

    }

    public void empezar(View v){
        mensaje.setText("Adivina");
        edit.setText("");
        num= rnd.nextInt();
    }
}