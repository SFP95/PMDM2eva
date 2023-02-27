package com.example.pmdm2eva;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class MiPartidoAdapter extends ArrayAdapter<Partido> {

    public MiPartidoAdapter( Context context, Partido[] partidos) {
        super(context, 0,partidos);
    }
    public MiPartidoAdapter( Context context, List<Partido> partidos) {
        super(context, 0,partidos);
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        return (getItem(position).getLocal()== null)?1:0;
    }

    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Partido p = getItem(position);
        View v;
        ViewHolder vh;

        if (convertView == null){
            int elemento_basido_de_lista = 0;
            if (p.getLocal()==null){
                elemento_basido_de_lista = R.layout.local;
            }else {
                elemento_basido_de_lista = R.layout.visitante;
            }
            v= LayoutInflater.from(getContext()).inflate( elemento_basido_de_lista,parent,false);
            TextView tvLocal = v.findViewById(R.id.tvLocal);
            TextView tvVitante = v.findViewById(R.id.tvVisitante);
            TextView res1 = v.findViewById(R.id.tvres1);
            TextView res2 = v.findViewById(R.id.tvres2);

            vh = new  ViewHolder(tvLocal,tvVitante,res1,res2);
            v.setTag(vh);
        }else {
            v = convertView;
            vh = (ViewHolder) v.getTag();
        }
        vh.getLocal().setText(p.getLocal());
        vh.getVisitante().setText(p.getVisitante());
        vh.getRes1().setText(p.getRes1());
        vh.getRes2().setText(p.getRes2());

        return v;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).getLocal().hashCode();
    }
}
