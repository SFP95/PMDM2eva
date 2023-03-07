 package com.example.pmdm2eva.cronos.mycrono.Assouik_fouad.app.src.main.java.org.fouad.assouik_fouad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CronoAdapter extends ArrayAdapter<String> {
    public CronoAdapter(@NonNull Context context, @NonNull List<String> objects) {
        super(context, 0, objects);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view;
        String  tiempo=getItem(position);
        TextView textViewnombre;
        DataHolder dataHolder;

        if(convertView==null){
            view= LayoutInflater.from(getContext()).inflate(R.layout.vista_crono,null);
            textViewnombre=view.findViewById(R.id.txtCronoVista);
            dataHolder=new DataHolder(textViewnombre);
            view.setTag(dataHolder);
        }else{

            view=convertView;
            dataHolder= (DataHolder) view.getTag();
        }

        dataHolder.getTextViewNombre().setText(tiempo);



        return view;

    }
}
