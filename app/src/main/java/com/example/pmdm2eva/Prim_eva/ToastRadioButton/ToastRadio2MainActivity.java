package com.example.ej1.ToastRadioButton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ej1.R;

public class ToastRadio2MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_radio2_main);
        Controles();


    }

    public void Controles(){
        this.r1= findViewById(R.id.peli1);
        this.r2= findViewById(R.id.peli2);
        this.r3= findViewById(R.id.peli3);
        this.r4= findViewById(R.id.peli4);
    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        nombrePeli= "";
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.peli1:
                if (checked)
                    nombrePeli=r1.getText().toString();
                break;
            case R.id.peli2:
                if (checked)
                    nombrePeli=r2.getText().toString();
                break;
            case R.id.peli3:
                if (checked)
                    nombrePeli=r3.getText().toString();
                break;
            case R.id.peli4:
                if (checked)
                    nombrePeli=r4.getText().toString();
                break;


        }
    }


    public void irAOtraPantalla(View view) {
        Bundle extras = getIntent().getExtras();
        String d1= extras.getString("dato1");
        Intent inte = new Intent(this,MainActivity.class);
        inte.putExtra(  "dato1"," "+nombrePeli+ " " +d1);
        setResult(RESULT_OK,inte);
        startActivity(inte);
    }
}