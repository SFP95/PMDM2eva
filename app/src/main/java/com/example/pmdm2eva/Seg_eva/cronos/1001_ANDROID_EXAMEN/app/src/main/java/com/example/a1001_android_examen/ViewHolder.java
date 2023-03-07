package com.example.a1001_android_examen;

import android.widget.TextView;

public class ViewHolder {

    TextView pelicula;
    TextView director;

    public ViewHolder(TextView pelicula, TextView director) {
        this.pelicula = pelicula;
        this.director = director;
    }

    public TextView getPelicula() {
        return pelicula;
    }

    public void setPelicula(TextView pelicula) {
        this.pelicula = pelicula;
    }

    public TextView getDirector() {
        return director;
    }

    public void setDirector(TextView director) {
        this.director = director;
    }
}
