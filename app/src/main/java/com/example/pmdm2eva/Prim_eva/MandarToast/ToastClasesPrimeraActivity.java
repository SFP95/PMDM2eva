package com.example.ej1.MandarToast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ej1.R;

public class ToastClasesPrimeraActivity extends AppCompatActivity {

    private Button btn;
    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toastclasesprimera);
    }

    public void press(View v) {
        Intent i = new Intent(this, SecondActivity.class);
        //String nombre = !et.getText().toString().equals("") ? et.getText().toString() : "JOHN DOE";
        //Persona persona = new Persona(nombre);
        //i.putExtra("persona", persona);
        // startActivity(i);

        i.putExtra("mensaje",((EditText)(findViewById(R.id.ed))).getText().toString());
        startActivityForResult(i,1);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String mensajeContestacion = data.getStringExtra("contestacion");
        Toast.makeText(this, mensajeContestacion, Toast.LENGTH_SHORT).show();
    }
}