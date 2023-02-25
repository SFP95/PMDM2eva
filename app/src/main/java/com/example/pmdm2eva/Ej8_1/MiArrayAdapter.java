package com.example.pmdm2eva.Ej8_1;

import android.annotation.SuppressLint;
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

public class MiArrayAdapter extends ArrayAdapter<Libro> {


    public MiArrayAdapter(Context context, Libro[] libros) {
        super(context, 0, libros);
    }

    public MiArrayAdapter(Context context, List<Libro> libros) {
        super(context, 0, libros);
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    public int getItemViewType(int position) {
        return (getItem(position).getAutor() == null)?1:0;
    }

    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Libro l = getItem(position);
        View v;
        ViewHolder vh;


        if (convertView == null) {
            int elemento_basico_de_lista = 0;
            if (l.getAutor()==null) {
                elemento_basico_de_lista = R.layout.elemento_basico_de_lista_anonimo;
            }
            else {
                elemento_basico_de_lista = R.layout.elemento_basico_de_lista_con_autor;
            }
            v = LayoutInflater.from(getContext()).inflate(
                    elemento_basico_de_lista,
                    parent,
                    false);

            TextView tvTitulo = v.findViewById(R.id.titulo);
            TextView tvAutor = v.findViewById(R.id.autor);

            vh = new ViewHolder(tvTitulo, tvAutor);
            v.setTag(vh);

        }
        else {
            v = convertView;
            vh = (ViewHolder) v.getTag();
        }

        vh.getTitulo().setText(l.getTitulo());
        vh.getAutor().setText(l.getAutor());

        return v;
    }

    public boolean hasStableIds() { return true; }

    public long getItemId(int position) {
        return getItem(position).getTitulo().hashCode();
    }
}
