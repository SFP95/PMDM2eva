package com.example.ej1.ToastRadioButton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ej1.R;


public class ToastRadioctivity extends AppCompatActivity {

    private EditText txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = findViewById(R.id.editTextTextPersonName);
        mostrarMensaje();
    }

    private void mostrarMensaje() {
        String mensaje = getIntent().getStringExtra("dato1");
        Toast.makeText(this,mensaje, Toast.LENGTH_SHORT).show();
    }


    public void irAOtraPantalla2(View view) {
        Intent i = new Intent(this,ToastRadio2MainActivity.class);
        String texto= String.valueOf(txt1.getText());
        i.putExtra("dato1",texto);
        startActivity(i);
    }
}