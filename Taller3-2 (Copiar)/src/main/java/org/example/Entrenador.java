package org.example;

public class Entrenador {
    private String nombre;
    private int yearsExperience;
    private Deporte deporteEspecializado;
    private boolean equipo;

    public Entrenador(String nombre, int yearsExperience, Deporte deporteEspecializado) {
        this.nombre = nombre;
        this.yearsExperience = yearsExperience;
        this.deporteEspecializado = deporteEspecializado;
        this.equipo = false;

    }

    public String getNombre() {
        return nombre;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public Deporte getDeporteEspecializado() {
        return deporteEspecializado;
    }

    public Boolean getEquipo(){
        return equipo;
    }

    void setEquipo(Boolean estado){
        this.equipo = estado;
    }

    private void setNombre(String nombre){
        this.nombre = nombre;
    }

    private void setYearsExperience(int yearsExperience){
        this.yearsExperience = yearsExperience;
    }

    private void setDeporteEspecializado(Deporte deporteEspecializado){
        this.deporteEspecializado = deporteEspecializado;
    }

    //.............................................................................

    
}


