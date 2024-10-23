package org.example;

public class Partido {
    private Cancha cancha;
    private Equipo equipoA;
    private Equipo equipoB;
    private Equipo ganador;
    private String fecha;

    public Partido(Cancha cancha, Equipo equipoA, Equipo equipoB, Equipo ganador, String fecha) {
        this.cancha = cancha;
        this.equipoA = equipoA;
        this.equipoB = equipoB;
        this.ganador = ganador;
        this.fecha = fecha;
    }

    public Cancha getCancha() {
        return cancha;
    }

    public Equipo getEquipoA() {
        return equipoA;
    }

    public Equipo getEquipoB() {
        return equipoB;
    }

    public Equipo getGanador() {
        return ganador;
    }

    public String getFecha() {
        return fecha;
    }

    private void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }

    private void setEquipoA(Equipo equipoA) {
        this.equipoA = equipoA;
    }

    private void setEquipoB(Equipo equipoB){
        this.equipoB = equipoB;
    }
    
    private void setGanador(Equipo ganador) {
        this.ganador = ganador;
    }

    private void setFecha(String fecha) {
        this.fecha = fecha;
    }

    //................................................................................................

}