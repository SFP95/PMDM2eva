package com.example.pmdm2eva.cronos.mycrono.Gomez_Rafael.app.src.main.java.org.rgomez.gomez_rafael;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyArrayAdapter extends ArrayAdapter<Registros> {


    public MyArrayAdapter(@NonNull Context context,  @NonNull List<Registros> registros) {
        super(context, 0, registros);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View view;
        Registros registro =getItem(position);
        TextView tvRegistros;

        ViewHolder viewHolder;

        if(convertView == null){

            view = LayoutInflater.from(getContext()).inflate(
                    R.layout.elemento_basico_lista,
                    null
            );
            tvRegistros = view.findViewById(R.id.tvDato);
            viewHolder = new ViewHolder(tvRegistros);
            view.setTag(viewHolder);

        }else{
            view = convertView;
            viewHolder = (ViewHolder)view.getTag();
        }

        viewHolder.getRegistros().setText(String.valueOf(registro.getMarcas()));



        return view;
    }
}
