package org.example;

import java.util.ArrayList;

public class Cancha {
    private ArrayList<Partido> partidos;
    private String superficie;
    private String ubicacion;
    private int capacidadExpectadores;

    public Cancha(ArrayList<Partido> partidos, String superficie, String ubicacion, int capacidadExpectadores) {
        this.partidos = null;
        this.superficie = superficie;
        this.ubicacion = ubicacion;
        this.capacidadExpectadores = capacidadExpectadores;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public String getSuperficie() {
        return superficie;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getCapacidadExpectadores() {
        return capacidadExpectadores;
    }

    private void setSuperficie(String superficie){
        this.superficie = superficie;
    }

    private void setPartidos(ArrayList<Partido> partidos){
        this.partidos = partidos;
    }

    private void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }

    private void setCapacidadExpectadores(int capacidadExpectadores){
        this.capacidadExpectadores = capacidadExpectadores;
    }

    //....................................................................................



}