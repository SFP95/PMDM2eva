package com.example.ej1.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.ej1.R;

public class CheckBoxActivity extends AppCompatActivity {

    private RadioGroup rg;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        rg =  findViewById(R.id.rg);
        rb1 =  findViewById(R.id.radioButton);
        rb2 =  findViewById(R.id.radioButton2);
        rb3 =  findViewById(R.id.radioButton3);
        rb4 =  findViewById(R.id.radioButton4);
        txt = findViewById(R.id.textView);
        configurarListeners();
        pulsado();
    }

    private void configurarListeners() {
        this.rg.setOnCheckedChangeListener( (rg,id)->pulsado() );

        this.rb1.setOnCheckedChangeListener( (cb,b) -> pulsado() );
        this.rb2.setOnCheckedChangeListener( (cb,b) -> pulsado() );
        this.rb3.setOnCheckedChangeListener( (cb,b) -> pulsado() );
        this.rb4.setOnCheckedChangeListener( (cb,b) -> pulsado() );
    }


    public void pulsado() {

        if (rb1.isChecked() == true) {
            txt.setText("te la meto por el culo");
            System.out.println("a");
        } else if (rb2.isChecked() == true) {
            txt.setText("trombon");
        } else if (rb3.isChecked() == true) {
            txt.setText("te la meto al reves");
        } else if (rb4.isChecked() == true) {
            txt.setText("pepe");
        } else {
            txt.setText("");
        }


        /*public void pulsado(){
            switch (rg.getCheckedRadioButtonId()) {
                case R.id.radioButton:txt.setText("te la meto por el culo");break;
                case R.id.radioButton2:txt.setText("trombon");break;
                case R.id.radioButton3:txt.setText("te la meto al reves");break;
                case R.id.radioButton4:txt.setText("pepe");break;

            }
        }
    }*/
    }}