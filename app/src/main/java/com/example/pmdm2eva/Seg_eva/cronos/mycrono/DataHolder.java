package com.example.pmdm2eva.cronos.mycrono;

import android.widget.TextView;

public class DataHolder {
    private TextView tvNombre;
    public DataHolder (TextView tvNombre){
        this.tvNombre = tvNombre;
    }

    public TextView getTvNombre() {
        return tvNombre;
    }

    public void setTvNombre(TextView tvNombre) {
        this.tvNombre = tvNombre;
    }
}
