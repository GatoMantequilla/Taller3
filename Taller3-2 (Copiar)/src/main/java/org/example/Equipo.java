package org.example;

import java.util.ArrayList;

public class Equipo {
    private ArrayList<Deportista> deportistas;
    private Entrenador entrenador;

    public Equipo(ArrayList<Deportista> deportistas, Entrenador entrenador) {
        this.deportistas = deportistas;
        this.entrenador = entrenador;
    }

    public ArrayList <Deportista> getDeportistas() {
        return deportistas;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }
    
    //...........

    public void agregarDeportista(Deportista deportista){
        if (deportista.getEquipo() == null) {
           deportistas.add(deportista);
           System.out.println("El deportista fue agregado con exito ");
        } else {
            System.out.println("El deportista ya esta en otro equipo");
        }
    }

    public void agregarEntrenador(Entrenador entrenador){
        if (entrenador.getEquipo() == null ) {
            entrenador.setEquipo(true);
            System.out.println("El deportista fue agregado con exito ");
        } else {
            System.out.println("El entrenador ya esta en otro equipo");
        }
    }

    
    
}
