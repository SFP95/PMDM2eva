package com.example.a1001_android_examen;

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

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view;

        Pelicula pelicula= getItem(position);
        TextView textviewPelicula ;
        TextView textViewDirector ;

        ViewHolder viewHolder;

        if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(
                    R.layout.elemento_basico_lista,
                    null
            );
           textviewPelicula = view.findViewById(R.id.tvPelicula);
           textViewDirector = view.findViewById(R.id.tvDirector);
           viewHolder = new ViewHolder(textviewPelicula,textViewDirector);
           view.setTag(viewHolder);
        }else{
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();

        }

        viewHolder.getPelicula().setText(pelicula.getTitulo());
        viewHolder.getDirector().setText(pelicula.getDirector());


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
