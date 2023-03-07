package com.example.pmdm2eva.cronos.mycrono.Brox_Ponce_Alba_Maria.app.src.main.java.org.abrox.t5_ejemplos.brox_ponce_alba_maria;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyArrayAdapter extends ArrayAdapter {


    public MyArrayAdapter(@NonNull Context context,  @NonNull List objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v;
        ViewHolder vh;
        TextView tvTitulo;
        String segundos = (String) getItem(position);

        if(convertView == null){
            v = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item,
                    parent,
                    false);
            tvTitulo = v.findViewById(R.id.tvSecundaria);
            vh = new ViewHolder(tvTitulo);
            v.setTag(vh);
        }else{
            v = convertView;
            vh = (ViewHolder) v.getTag();
        }

        vh.getSegundos().setText(segundos);

        return v;
    }
}
