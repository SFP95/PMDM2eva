package com.example.pmdm2eva;

import android.widget.TextView;

public class ViewHolder {
    private TextView local;
    private TextView visitante;
    private TextView res1;
    private TextView res2;


    public  ViewHolder(TextView local,TextView visitante, TextView res1, TextView res2){
        this.local = local;
        this.visitante = visitante;
        this.res1 = res1;
        this.res2 = res2;
    }

    public TextView getLocal() {
        return local;
    }

    public void setLocal(TextView local) {
        this.local = local;
    }

    public TextView getVisitante() {
        return visitante;
    }

    public void setVisitante(TextView visitante) {
        this.visitante = visitante;
    }

    public TextView getRes1() {
        return res1;
    }

    public void setRes1(TextView res1) {
        this.res1 = res1;
    }

    public TextView getRes2() {
        return res2;
    }

    public void setRes2(TextView res2) {
        this.res2 = res2;
    }
}
