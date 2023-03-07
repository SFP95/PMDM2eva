package com.example.ej1.MandarToast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ej1.MainActivity;
import com.example.ej1.Persona;
import com.example.ej1.R;

public class SecondActivity extends AppCompatActivity {

    private TextView tv;
    private EditText ed;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toastclasessecond);
        tv = findViewById(R.id.tv);
        Persona persona = (Persona)(getIntent().getSerializableExtra("persona"));
        tv.setText("HOLA "+persona);
        ed = findViewById(R.id.mensajeContestacion);

        mostrarMensaje();
    }

    private void mostrarMensaje() {
        String mensaje = getIntent().getStringExtra("mensaje");
        Toast.makeText(this,mensaje, Toast.LENGTH_SHORT).show();
    }

    public void contestar(View v) {
        String mensajeDeContestacion = ed.getText().toString();
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("contestacion",mensajeDeContestacion);
        setResult(RESULT_OK,i);
        finish();
    }



}