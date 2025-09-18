package Entidadaes;

import Enums.TIPO_HANGAR;
import Entidadaes.Avion;

import java.util.ArrayList;
import java.util.List;

public class Hangar {

    private TIPO_HANGAR tipoHangar;
    private int capacidadMaxima; // Cuántos aviones puede contener
    private List<Avion> aviones;

    // Constructor
    public Hangar(TIPO_HANGAR tipoHangar, int capacidadMaxima) {
        this.tipoHangar = tipoHangar;
        this.capacidadMaxima = capacidadMaxima;
        this.aviones = new ArrayList<>();
    }

    // Getters y setters
    public TIPO_HANGAR getTipoHangar() {
        return tipoHangar;
    }

    public void setTipoHangar(TIPO_HANGAR tipoHangar) {
        this.tipoHangar = tipoHangar;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public List<Avion> getAviones() {
        return aviones;
    }

    public void setAviones(List<Avion> aviones) {
        this.aviones = aviones;
    }

    // Agregar un avión al hangar
    public void agregarAvion(Avion avion) {
        if (aviones.size() >= capacidadMaxima) {
            System.out.println("No se puede agregar el avión. Capacidad máxima del hangar alcanzada: " + capacidadMaxima);
            return;
        }
        aviones.add(avion);
        System.out.println("Avión agregado al hangar " + tipoHangar);
    }

    // Quitar un avión del hangar
    public void quitarAvion(Avion avion) {
        aviones.remove(avion);
    }

    // Hacer despegar todos los aviones del hangar
    public void despegarAviones() {
        if (aviones.isEmpty()) {
            System.out.println("No hay aviones en el hangar " + tipoHangar);
            return;
        }
        for (Avion avion : aviones) {
            avion.despegar();
        }
    }

    // Listar todos los aviones
    public void listarAviones() {
        if (aviones.isEmpty()) {
            System.out.println("No hay aviones en el hangar " + tipoHangar);
            return;
        }
        System.out.println("Aviones en el hangar " + tipoHangar + ":");
        for (Avion avion : aviones) {
            System.out.println(avion);
        }
    }

    @Override
    public String toString() {
        return "Hangar{" +
                "tipoHangar=" + tipoHangar +
                ", capacidadMaxima=" + capacidadMaxima +
                ", aviones=" + aviones.size() +
                '}';
    }
}
