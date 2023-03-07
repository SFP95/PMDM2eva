package com.example.a101_android_pruebaexamen;

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

public class MyArrayAdapter extends ArrayAdapter<Pelicula> {


    public MyArrayAdapter(@NonNull Context context, @NonNull List<Pelicula> pelicula) {
        super(context, 0, pelicula);
    }

    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = null;

        view = LayoutInflater.from(getContext()).inflate(
                R.layout.elemento_basico_lista,
                parent,
                false);

        TextView tvTitulo = view.findViewById(R.id.tvPelicula);
        TextView tvDirector = view.findViewById(R.id.tvDirector);

        Pelicula pelicula = getItem(position);

        tvTitulo.setText(pelicula.getTitulo());
        tvDirector.setText(pelicula.getDirector());

        return view;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }
    public long getItemId(int position){
        return getItem(position).getTitulo().hashCode();
    }
}
