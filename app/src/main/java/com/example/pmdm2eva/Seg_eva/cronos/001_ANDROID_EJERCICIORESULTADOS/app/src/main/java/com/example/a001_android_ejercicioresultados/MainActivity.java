import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
public class MainActivity extends AppCompatActivity {

    private List<Partido> listaPartidos = new ArrayList<Partido>();

    private ArrayAdapter<Partido>aa;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        leerCarpetaRaw();

        cargarListView();


    }



    private void leerCarpetaRaw() {

        List<String> listaDeDatos;
        InputStream is = getResources().openRawResource(R.raw.partido);
        Scanner scanner = new Scanner(is);
        listaDeDatos = new ArrayList<String>();

        // Lee el contenido del archivo línea por línea
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            listaDeDatos.add(line);
        }


        // Cierra el InputStream y el Scanner
        try {
            is.close();
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**CREAR OBJETOS PARTIDO**/
/*
        for(String frase : listaDeDatos){

            String[]palabras =  frase.split("-|,");

            Partido partido = new Partido();
            partido.setEqLocal(palabras[0]);
            partido.setEqVisitante(palabras[1]);
            partido.setGolLocal(palabras[2]);
            partido.setGolVisitante(palabras[3]);

            listaPartidos.add(partido);
        }

    }
    private void cargarListView() {

        aa = new MyArrayAdapter(
                this,
                listaPartidos
        );
        ListView lv = findViewById(R.id.listView);
        lv.setAdapter(aa);
        lv.setEmptyView(findViewById(R.id.emptyListView));

        lv.setOnItemClickListener((parent, view, position, id) -> onClickBreve(position));
        lv.setOnItemLongClickListener((parent, view, position, id) -> onClickLarga(position));

    }

    private boolean onClickLarga(int position) {
        Toast.makeText(this, "Han pulsado el elemento("+position+")largamente", Toast.LENGTH_SHORT).show();
        aa.remove(aa.getItem(position));

        return true;
    }

    private void onClickBreve(int position) {
        Toast.makeText(this, "Han pulsado el elemento("+position+")cortamente", Toast.LENGTH_SHORT).show();
    }
}*/