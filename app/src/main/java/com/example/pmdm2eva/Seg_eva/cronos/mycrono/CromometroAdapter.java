package com.example.pmdm2eva.cronos.mycrono;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.pmdm2eva.R;

import java.util.List;

public class CromometroAdapter extends ArrayAdapter<String> {
    public CromometroAdapter (@NonNull Context context, @NonNull List<String> objets ){
        super(context, 0, objets);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view;
        String tiempo = getItem(position);
        TextView tvNombre;
        DataHolder dataHolder;
       if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.vista_tiempos,null);
            tvNombre = view.findViewById(R.id.txtCronoVista);
            dataHolder = new DataHolder(tvNombre);
            view.setTag(dataHolder);
        }else {
            view = convertView;
            dataHolder = (DataHolder) view.getTag();
        }
        dataHolder.getTvNombre().setText(tiempo);
        return view;
    }
}
