package com.example.ej1.ExternaYInterna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.ej1.R;

public class ExternaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_externa);
    }
    public void cerrar(View v) {
        finish();
    }
}