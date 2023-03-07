package com.example.ej1.Split;

import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Split{
        private static String text="Alba-Jessica-Carols-David-Marcelo-Gavi-Fouad-Rafa-Maria";

        public static void main(String[] args) {
            dividir();
        }

        private static void dividir() {
            String[] palabra= text.split("-");
            for(int i =0;i<palabra.length;i++){
                System.out.println(i+" "+ palabra[i]);
            }
        }

        //Forma de aplicarlo en un casi de implicitas

        public void caso2b(View v) {
            String[] palabra = text.split("-");
            for (int i = 0; i < palabra.length; i++) {
                System.out.println(i + " " + palabra[i]);
            }
            System.out.println("*************************");
            List<String> lista = new ArrayList<String>();
            String cadena = "HOLA-BUENOS-DIAS";
            String[] palabras = cadena.split("-");
            for (String el : palabra) {
                // System.out.println(el);
                lista.add(el);
                System.out.println(lista.get(1));
            }
        }
/*
 * public void separarcadenas(){
 *         String cadena= "Hola-cadena";
 *         String mensaje="";
 *         cadena.split("-");
 *         String[] separated =  cadena.split("-");
 *         for(String palabra: separated){
 *             System.out.println(palabra);
 *             mensaje +=palabra+"&&";
 *         }
 *
 *     }
 */


}
