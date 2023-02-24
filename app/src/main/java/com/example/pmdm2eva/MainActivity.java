package com.example.pmdm2eva;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

}

/* EJ 6.2 CONSEJOS DEL DIA con Toast
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