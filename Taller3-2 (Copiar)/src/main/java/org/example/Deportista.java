package org.example;

public class Deportista {
    private String nombre;
    private String apellido;
    private int contacto;
    private Deporte deporte;
    private Equipo equipo;
    
    public Deportista(String nombre, String apellido, int contacto, Deporte deporte) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contacto  = contacto;
        this.deporte = deporte;
        this.equipo = null;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getContacto() {
        return contacto;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public Equipo getEquipo(){
        return equipo;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setApellido(String apellido) {
        this.apellido = apellido;
    }

    private void  setContacto(int contacto) {
        this.contacto = contacto;
    }

    private void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }



}

