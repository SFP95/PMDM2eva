package com.example.ej1.Prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ej1.R;

import java.util.Random;

public class Prueba2Activity extends AppCompatActivity {
    static Random rnd = new Random();;
    static String num;
    static int numero;
    private EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        num = (String) getIntent().getSerializableExtra("numero");
        numero = Integer.parseInt(num);
        ed = findViewById(R.id.ed1);






    }

    public void bt1(View v){ed.setText(ed.getText()+"1");}
    public void bt2(View v){ed.setText(ed.getText()+"2");}
    public void bt3(View v){ed.setText(ed.getText()+"3");}
    public void bt4(View v){ed.setText(ed.getText()+"4");}
    public void bt5(View v){ed.setText(ed.getText()+"5");}
    public void bt6(View v){ed.setText(ed.getText()+"6");}





    public void comenzar(View v){

        int numero2 = rnd.nextInt(numero);
        System.out.println(numero2);
        String num2 = String.valueOf(numero2);

        if(ed.getText().equals(num2)){
            Toast toast=Toast.makeText(this,"enhorabuena", Toast.LENGTH_SHORT);
            toast.show();
        }else{
            Toast toast=Toast.makeText(this,"fallaste, el numero era: "+ numero2, Toast.LENGTH_SHORT);
            toast.show();
            ed.setText("");
        }


    }
}