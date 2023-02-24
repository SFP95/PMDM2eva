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
    private RadioButton radioButton;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        radioGroup= findViewById(R.id.radioGroup);
        radioButton=findViewById(R.id.rbAgobiado);
        int idButtons = radioGroup.getCheckedRadioButtonId();
        if (radioButton.isChecked()){
            radioButton.setChecked(idButtons);
        }
    }

}

/* EJ 6.1 Radiogroup que recuerda la opcion al cerrar al activity y volver a abrirse
*
*
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