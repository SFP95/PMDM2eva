package com.example.pmdm2eva.Ej7_5;
/*
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity_7_5 extends AppCompatActivity {

    class MiDibujo extends View {

        private Paint _b1;
        private Paint _b2;

        public MiDibujo(Context context) {
            super(context);

            _b1 = new Paint();
            _b1.setColor(0xFF0000FF);
            _b1.setStyle(Paint.Style.FILL);

            _b2 = new Paint();
            _b2.setColor(0xFFFFFF00);
            _b2.setStyle(Paint.Style.FILL);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            int alto = canvas.getHeight();
            int ancho =canvas.getWidth();
            int inc = ancho / 10;
            Paint brocha = _b1;

            for (int i=0; i<10; i++) {
                brocha = brocha ==_b1 ? _b2 : _b1;
                canvas.drawRect(inc*i ,0,(i+1)*inc ,alto, brocha);
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MiDibujo(this));
    }
}*/