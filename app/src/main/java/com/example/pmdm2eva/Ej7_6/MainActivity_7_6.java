package com.example.pmdm2eva.Ej7_6;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_7_6 extends AppCompatActivity {

    class EjemploMultiTouch extends View {

        private PointF[] _dedos;
        private Paint _brocha;
        private int numDedos;

        @Override
        public boolean onTouchEvent(MotionEvent me) {


            if (me.getAction() == me.ACTION_UP) {
                numDedos = 0;
            }
            else {
                if (me.getPointerCount()>10) {
                    numDedos = 10;
                }
                else {
                    numDedos = me.getPointerCount();
                }

                for (int i = 0; i < numDedos; i++) {
                    float x = me.getX(i);
                    float y = me.getY(i);
                    PointF dedo = new PointF(x,y);
                    _dedos[i] = dedo;
                }
                invalidate();
            }
            return true;
        }

        public EjemploMultiTouch(Context context) {
            super(context);

            _brocha = new Paint();
            _brocha.setColor(0xFF00FFFF);
            _brocha.setStyle(Paint.Style.FILL);

            _dedos = new PointF[10];


        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawColor(0xFFFFFFFF);
            for ( int i=0; i<numDedos; i++) {
                PointF dedo = _dedos[i];
                canvas.drawCircle(dedo.x, dedo.y, 200, _brocha);
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new EjemploMultiTouch(this));
    }
}

/* EJ 7.5 Dibujar Canvas de 10 lineas verticales distribuidas uniformemente
de forma alterna


public class MainActivity extends AppCompatActivity {

    class MiDibujo extends View{

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
        setContentView(R.layout.activity_main);
        }
}

*///7.5

/* EJ 7.4 mustras valores de : x,y, x + valor de precisión
*
*
public class MainActivity_7_4 extends AppCompatActivity implements SensorEventListener {

    SensorManager _sm;
    Sensor _acelerometro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializar();
        }

    private void inicializar() {
        _sm = (SensorManager) getSystemService(SENSOR_SERVICE);
        _acelerometro = _sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
    }

    @Override
    protected void onPause() {
        super.onPause();
        _sm.unregisterListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        _sm.registerListener(this,_acelerometro,SensorManager.SENSOR_DELAY_NORMAL);

    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        float x = event.values[0];
        float y = event.values[1];
        float z = event.values[2];
        int precision = event.accuracy;

        TextView tvX = findViewById(R.id.tvX);
        TextView tvY = findViewById(R.id.tvY);
        TextView tvZ = findViewById(R.id.tvZ);
        TextView tvPrecision = findViewById(R.id.tvPrecision);

        tvX.setText(String.format("%.2f",x));
        tvY.setText(String.format("%.2f",y));
        tvZ.setText(String.format("%.2f",z));
        tvPrecision.setText(""+precision);


    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) { }
}
*
* *///7.4

/* EJ 7.3 mostrar nombre de todos los ensores disponibles en el teléfono
*
*
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mostrarSensores();
        }

    private void mostrarSensores() {
        SensorManager sm = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> sensores = sm.getSensorList(Sensor.TYPE_ALL);

        String texto = "Total sensores: " + sensores.size() + "\n";
        int n = 1;
        for (Sensor sensor: sensores){
            texto += ("\n[" + n++ + "] " + sensor.getName() + "\n");
        }
        TextView pantalla =  findViewById(R.id.tvPantalla);
        pantalla.setText(texto);
    }

}
*
* *///7.3

/* EJ 7.2 patron con ritmo

public class MainActivity extends AppCompatActivity {

    private Vibrator _v;
    private final long cBase = 300;     //corchea base con tiempo fijo
    private final long s = 100;         //silencio
    private final long c = cBase-s;     //corchea
    private final long n = cBase*2-s;   //negra
    private final long b = cBase*4-s;   //blanca

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

    public void onVibrar(View view) {
        long[] melodia ={s,
                c,s,c,s,n,s,n,s,n,s,b,s,
                c,s,c,s,n,s,n,s,n,s,b,s,
                c,s,c,s,n,s,n,s,n,s,n,s,b,s,
                c,s,c,s,n,s,n,s,n,s,b,s};
        _v = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            _v.vibrate(VibrationEffect.createWaveform(melodia,-1));
        }else {
            _v.vibrate(melodia,-1);
        }
    }
}

* *///7.2

/* EJ 7.1 Sensores vibracion con tiempo he intensidad

public class MainActivity extends AppCompatActivity {

    private Vibrator _v;
    EditText etTiempo;
    EditText etIntensidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

    public void onProbar(View view) {
        long tiempo;
        int intensidad;
        etTiempo = findViewById(R.id.etTiempo);
        etIntensidad =  findViewById(R.id.etIntensidad);

        tiempo = Long.parseLong(etTiempo.getText().toString());
        intensidad = Integer.parseInt(etIntensidad.getText().toString());
        _v = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            _v.vibrate(VibrationEffect.createOneShot(tiempo*1000,intensidad));
        }else{
            _v.vibrate(tiempo);
        }
    }

    public void onParar(View view) {
        _v.cancel();
    }
}

* *///7.1

/*EJ 6.3 Libro de firmas
 *
*private final String NOMBRE_FICHERO = "visitas.txt";
    private ArrayList<String> _listaVisitantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarListaVisitantes();
        leerFichero();
        actualizarTvVisitantes();

    }

    private void leerFichero() {
        try {
            FileInputStream fich;
            fich = openFileInput(NOMBRE_FICHERO);
            Scanner scan = new Scanner(fich);
            while (scan.hasNextLine()){
                _listaVisitantes.add(scan.nextLine());
            }
            scan.close();
        }catch (IOException e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private void inicializarListaVisitantes() {
        this._listaVisitantes = new ArrayList<>();
    }

    private void actualizarTvVisitantes() {
        String texto="";
        for (String nombre: _listaVisitantes){
            texto += (nombre+"\n");
        }
        TextView tv=findViewById(R.id.tcListavisitantes);
        tv.setText(texto);
    }
    private void actualizarListaVisitantes() {
        EditText et = findViewById(R.id.edNombre);
        _listaVisitantes.add(et.getText().toString());
    }

        public void onRegistrar(View view) {
        actualizarListaVisitantes();
        escribirFichero();
        actualizarTvVisitantes();
    }

    private void escribirFichero() {
        try {
            FileOutputStream fos;
            fos = openFileOutput(NOMBRE_FICHERO, Context.MODE_PRIVATE | Context.MODE_APPEND);
            java.io.OutputStreamWriter out;
            out = new OutputStreamWriter(fos);
            for (String nombre: _listaVisitantes){
                out.write(nombre+"\n");
                out.close();
            }
        }catch (Exception e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
*
* *///6.3

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
* *///6.2

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
* *///6.1 POR RESOLVER

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
* *///6.0