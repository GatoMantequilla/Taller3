package org.example;

import java.util.ArrayList;

public class Club {
    private ArrayList<Deporte> deportes;
    private String nombre;

    public Club(String nombre, ArrayList<Deporte> deportes) {
        this.nombre = nombre;
        this.deportes = deportes;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList <Deporte> getDeportes() {
        return deportes;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setDeportes(ArrayList<Deporte> deportes) {
        this.deportes = deportes;
    }

    //........................................................................................Metodos

    public  void agregarDeporte(Deporte deporte) {
        deportes.add(deporte);
        System.out.println("Deporte agregado con exito");
    }

}