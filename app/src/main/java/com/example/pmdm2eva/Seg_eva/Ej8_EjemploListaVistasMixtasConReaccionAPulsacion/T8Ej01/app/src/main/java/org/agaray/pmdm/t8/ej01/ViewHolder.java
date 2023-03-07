package org.agaray.pmdm.t8.ej01;

import android.widget.TextView;

public class ViewHolder {
    private TextView titulo;
    private TextView autor;


    public ViewHolder(TextView titulo, TextView autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public TextView getTitulo() {
        return titulo;
    }

    public void setTitulo(TextView titulo) {
        this.titulo = titulo;
    }

    public TextView getAutor() {
        return autor;
    }

    public void setAutor(TextView autor) {
        this.autor = autor;
    }
}
