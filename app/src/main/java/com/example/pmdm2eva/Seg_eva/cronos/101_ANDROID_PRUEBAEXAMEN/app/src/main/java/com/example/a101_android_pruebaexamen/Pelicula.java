package com.example.a101_android_pruebaexamen;

import android.os.Parcelable;

import java.io.Serializable;

public class Pelicula implements Serializable {

    private String titulo;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director) {
        this.titulo = titulo;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
