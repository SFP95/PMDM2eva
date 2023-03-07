package com.example.ej1.Dialogo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ej1.R;

public class DialogoActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogo);
        btn = findViewById(R.id.button);
        mostrarDialogo();
    }

    public void press(View v){
        mostrarDialogo();
    }

    private void mostrarDialogo() {

        new AlertDialog.Builder(this)
                .setTitle("Elija")
                .setMessage("¿Te gusta Android?")
                .setPositiveButton("aceptar", new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                aceptar();
                            }
                        }
                ).setNegativeButton("No", new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                no();
                            }
                        }

                ).setNeutralButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        cancelar();
                    }
                }).show();

    }
    public void aceptar(){

        Toast toast = Toast.makeText(	this, "me alegro", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void no(){

        Toast toast = Toast.makeText(	this, "Lo tuyo es el desarrollo web", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void cancelar(){

        Toast toast = Toast.makeText(	this, "Pásate a Kotlin", Toast.LENGTH_SHORT);
        toast.show();
    }
}