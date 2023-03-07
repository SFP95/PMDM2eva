package com.example.a102_android_ejercicioexamen;

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
