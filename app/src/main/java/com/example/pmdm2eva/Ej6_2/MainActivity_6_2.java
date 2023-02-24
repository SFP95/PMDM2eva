package com.example.pmdm2eva.Ej6_2;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pmdm2eva.R;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
/*
public class MainActivity_6_2 extends AppCompatActivity {

    private ArrayList<String> _consejos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarConsejos();
    }

    private void cargarConsejos() {
        _consejos = new ArrayList<>();
        InputStream is= getResources().openRawResource(R.raw.consejos);
        Scanner scan = new Scanner(is);
        while (scan.hasNextLine()){
            _consejos.add(scan.nextLine());
        }
    }

    public void onAconsejar(View v) {
        String consejo="";
        int index= (int) (Math.random()*_consejos.size());
        Toast.makeText(this,_consejos.get(index),Toast.LENGTH_SHORT).show();
    }
}

/* EJ 6.2 CONSEJOS DEL DIA con Toast
*
* Usando un documento txt llamado consejos localizado en res/raw/  , el folser raw lo creamoss nosotros
*
public class MainActivity extends AppCompatActivity {

    private ArrayList<String> _consejos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarConsejos();
    }

    private void cargarConsejos() {
        _consejos = new ArrayList<>();
        InputStream is= getResources().openRawResource(R.raw.consejos);
        Scanner scan = new Scanner(is);
        while (scan.hasNextLine()){
            _consejos.add(scan.nextLine());
        }
    }

    public void onAconsejar(View v) {
        String consejo="";
        int index= (int) (Math.random()*_consejos.size());
        Toast.makeText(this,_consejos.get(index),Toast.LENGTH_SHORT).show();
    }
}
*
* */


/* EJ 6.1 Radiogroup que recuerda la opcion al cerrar al activity y volver a abrirse
*
* NO FUNCIONA, POR MIRAR BIEN
*
*public class MainActivity extends AppCompatActivity {
    private RadioButton rbAgobiado;
    private RadioButton rbTriste;
    private RadioButton rbContento;
    private RadioButton rbEuforico;
    private RadioButton rbCabreado;

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup= findViewById(R.id.radioGroup);

        rbTriste= findViewById(R.id.rbTriste);
        rbEuforico= findViewById(R.id.rbEuforico);
        rbAgobiado= findViewById(R.id.rbAgobiado);
        rbCabreado= findViewById(R.id.rbCabreado);
        rbContento= findViewById(R.id.rbContento);

        switch (radioGroup.getCheckedRadioButtonId()){
            case 1: rbTriste.setChecked(true);
            case 2: rbContento.setChecked(true);
            case 3: rbAgobiado.setChecked(true);
            case 4: rbEuforico.setChecked(true);
            case 5: rbCabreado.setChecked(true);

        }
    }

    public void onComprobar(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.rbTriste:
                if (checked)
                    break;
            case R.id.rbContento:
                if (checked)
                    break;
        }

    }
}
*
* */

/*EJ 6.0 recoger texto de Edit text a un toast que se miestar al pulsar un botón
*
public class MainActivity extends AppCompatActivity {
    private EditText edt;
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void onToast(View v) {
        edt= findViewById(R.id.EdTexto);
        String mensaje= edt.getText().toString();
        Toast.makeText(this,mensaje,Toast.LENGTH_SHORT).show();

    }
}
*
* */