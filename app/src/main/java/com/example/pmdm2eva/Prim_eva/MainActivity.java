package com.example.pmdm2eva.Prim_eva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ej1.MandarToast.SecondActivity;

/*
public class MainActivity extends AppCompatActivity {
/*
    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    private EditText texto;
    private int num1=0;
    private int num2=0;
    static String operacion;*/
/*
    private EditText ed ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed = findViewById(R.id.numero);







      /*  btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);


        texto = findViewById(R.id.texto);
*/
/*
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

    /*

    }
    public void borrar(View v){
        texto.setText("0");
    }
    public void numero0(View v){texto.setText(texto.getText()+ "0");}
    public void numero1(View v){texto.setText(texto.getText()+ "1");}
    public void numero2(View v){texto.setText(texto.getText()+ "2");}
    public void numero3(View v){texto.setText(texto.getText()+ "3");}
    public void numero4(View v){texto.setText(texto.getText()+ "4");}
    public void numero5(View v){texto.setText(texto.getText()+ "5");}
    public void numero6(View v){texto.setText(texto.getText()+ "6");}
    public void numero7(View v){texto.setText(texto.getText()+ "7");}
    public void numero8(View v){texto.setText(texto.getText()+ "8");}
    public void numero9(View v){texto.setText(texto.getText()+ "9");}


    public void sumar(View v){
         operacion = "+";
        num1=Integer.parseInt(texto.getText().toString());
        texto.setText(texto.getText()+"+");
        texto.setText("");
    }
    public void restar(View v){
        operacion = "-";
        num1=Integer.parseInt(texto.getText().toString());
        texto.setText(texto.getText()+"-");
        texto.setText("");
    }
    public void dividir(View v){
        operacion = "/";
        num1=Integer.parseInt(texto.getText().toString());
        texto.setText(texto.getText()+"/");
        texto.setText("");
    }
    public void multiplicar(View v){
        operacion = "*";
        num1=Integer.parseInt(texto.getText().toString());
        texto.setText(texto.getText()+"*");
        texto.setText("");
    }

    public void igual(View v){
        num2 = Integer.parseInt(texto.getText().toString());
        texto.setText("");
        texto.setText(calcularTotal());
        System.out.println("aaaaaaaaaaaa");

    }

    public String calcularTotal(){
        int num=0 ;
        switch ( operacion ) {
            case "+":num = num1 + num2;break;
            case "-":num = num1 - num2;break;
            case "X":num = num1 * num2;break;
            case "/":num = num1 / num2;break;
        }
        String numero= String.valueOf(num);
        return numero;
    }

*/
/*

}*/
