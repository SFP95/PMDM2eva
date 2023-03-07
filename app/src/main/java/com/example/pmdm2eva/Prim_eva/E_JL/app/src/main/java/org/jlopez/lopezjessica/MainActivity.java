package org.jlopez.lopezjessica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText ed;
    private Button btnS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed = findViewById(R.id.frase);
        btnS = findViewById(R.id.btnSiguiente);

    }

    public void pasarSiguiente(View v){
        String frase = ed.getText().toString();
        String[] palabra= frase.split(",");


        if(palabra.length==4){
            Intent i = new Intent(this, MainActivity2.class);
             i.putExtra("mensaje",((EditText)(findViewById(R.id.frase))).getText().toString());
             startActivityForResult(i,1);

        }else{
            Toast toast = Toast.makeText(this,"Debes introducir 4 palabras separadas por comas.",Toast.LENGTH_SHORT);
            toast.show();
        }

    }
}