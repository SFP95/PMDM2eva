package com.example.ej1.Prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ej1.MainActivity2;
import com.example.ej1.R;

public class Prueba1Activity extends AppCompatActivity {

    private EditText ed ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed = findViewById(R.id.numero);


    }
    public void press1(View v){
        String num = !ed.getText().toString().equals("") ? ed.getText().toString() : "0";
        int numero = Integer.parseInt(num);

        if(numero>=6 && numero<=10){
            Intent i = new Intent(this, MainActivity2.class);
            i.putExtra("numero", num);

            Toast toast=Toast.makeText(this,"okey sigue", Toast.LENGTH_SHORT);
            toast.show();

            startActivity(i);
        }else{
            Toast toast=Toast.makeText(this,"sigue probando", Toast.LENGTH_SHORT);
            toast.show();
        }

    }

}