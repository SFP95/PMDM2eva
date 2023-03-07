package com.example.pmdm2eva.Ej6_1;
/*
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pmdm2eva.R;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //radioGroup.setOnCheckedChangeListener((rgr,id)->recordarEstado());
        actualizarEstado();
    }

    private void actualizarEstado() {
        try {
//            SharedPreferences preferences = getPreferences("estado",Context.MODE_PRIVATE);

            SharedPreferences preferences = getSharedPreferences("estado",Context.MODE_PRIVATE);
            int estadoDeanimo = preferences.getInt("animo",-1);
            if (estadoDeanimo != -1){
                RadioButton rb= findViewById(estadoDeanimo);
                rb.setChecked(true);
            }
        }catch (Exception e){
            e.getMessage();
        }

    }

    private void recordarEstado() {
        SharedPreferences preferences = getSharedPreferences("estado",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        radioGroup= findViewById(R.id.radioGroup);
        editor.putInt("animo",radioGroup.getCheckedRadioButtonId());
        editor.commit();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        recordarEstado();
    }
}

*/