package com.example.pmdm2eva;

public class Partido {
    private String local;
    private String visitante;
    int res1;
    int res2;

    public Partido (String local, String visitante, int res1, int res2){
        this.local = local;
        this.visitante = visitante;
        this.res1 = res1;
        this.res2 = res2;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getVisitante() {
        return visitante;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    public int getRes1() {
        return res1;
    }

    public void setRes1(int res1) {
        this.res1 = res1;
    }

    public int getRes2() {
        return res2;
    }

    public void setRes2(int res2) {
        this.res2 = res2;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "local='" + local + '\'' +
                ", visitante='" + visitante + '\'' +
                ", res1=" + res1 +
                ", res2=" + res2 +
                '}';
    }
}
