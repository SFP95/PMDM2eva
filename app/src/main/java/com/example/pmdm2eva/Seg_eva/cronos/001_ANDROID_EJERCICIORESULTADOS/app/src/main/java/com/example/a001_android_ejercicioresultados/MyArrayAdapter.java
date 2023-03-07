import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyArrayAdapter extends ArrayAdapter<Partido> {


    public MyArrayAdapter(@NonNull Context context, @NonNull List<Partido> partido) {
        super(context, 0, partido);
    }


    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view;

        //INFLAR LA VISTA QUE CONTIENE CADA ELEMENTO DE LA LISTA

        view = LayoutInflater.from(getContext()).inflate(
                R.layout.elemento_basico_de_lista,
                parent,
                false);

        TextView tvEquLocal = view.findViewById(R.id.tv1);
        TextView tvResultLocal = view.findViewById(R.id.tv2);
        TextView tvResultVisitante = view.findViewById(R.id.tv3);
        TextView tvEquVisitante = view.findViewById(R.id.tv4);

        Partido partido = getItem(position);

        tvEquLocal.setText(partido.getEqLocal());
        tvResultLocal.setText(partido.getGolLocal());
        tvResultVisitante.setText(partido.getGolVisitante());
        tvEquVisitante.setText(partido.getEqVisitante());


        return view;
    }


}
