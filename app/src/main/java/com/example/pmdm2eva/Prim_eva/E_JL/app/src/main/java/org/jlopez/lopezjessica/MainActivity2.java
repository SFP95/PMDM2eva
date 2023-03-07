package org.jlopez.lopezjessica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    private TextView tv2;
    private Button btn1,btn2,btn3,btn4,siguiente;
    private RadioGroup rg;
    private RadioButton rb1,rb2;
    private String[]palabra;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv2 = findViewById(R.id.tv2);
        btn1= findViewById(R.id.btn1);
        btn2= findViewById(R.id.btn2);
        btn3= findViewById(R.id.btn3);
        btn4= findViewById(R.id.btn4);

        rb1 = findViewById(R.id.rbMa);
        rb2 = findViewById(R.id.rbMin);
        rg = findViewById(R.id.rg);


        pulsado();


        String mensaje = getIntent().getStringExtra("mensaje");
        


        palabra= mensaje.split(",");
        for(String e : palabra){
            System.out.println(e);
        }

        btn1.setText(palabra[0]);
        btn2.setText(palabra[1]);
        btn3.setText(palabra[2]);
        btn4.setText(palabra[3]);
        configurarListeners();

    }

    private void configurarListeners() {
        this.rg.setOnCheckedChangeListener( (rg,id)->pulsado() );

        this.rb1.setOnCheckedChangeListener( (cb,b) -> pulsado() );
        this.rb2.setOnCheckedChangeListener( (cb,b) -> pulsado() );
    }


    private void pulsado() {

        if (rb1.isChecked() == true) {
            String fraseNormal = tv2.getText().toString();
            String fraseMayus = fraseNormal.toUpperCase();
            System.out.println(fraseMayus);
            tv2.setText(fraseMayus);

        } else if (rb2.isChecked() == true) {
            String fraseNormal = tv2.getText().toString();
            String fraseMinus = fraseNormal.toLowerCase();
            tv2.setText(fraseMinus);
        }

    }



    public void boton1(View  v){
        btn1.setText(palabra[0]);
        String n1=btn1.getText().toString();
        tv2.setText(n1);
    }
    public void boton2(View  v){
        btn2.setText(palabra[1]);
        String n2=btn2.getText().toString();
        tv2.setText(n2);
    }
    public void boton3(View  v){
        btn3.setText(palabra[2]);
        String n3=btn3.getText().toString();
        tv2.setText(n3);
    }
    public void boton4(View  v){
        btn4.setText(palabra[3]);
        String n4=btn4.getText().toString();
        tv2.setText(n4);
    }

    public void volver(View v){
        finish();
    }


}