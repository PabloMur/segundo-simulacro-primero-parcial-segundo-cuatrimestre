package Entidadaes;

import Enums.TIPO_HANGAR;
import Entidadaes.Avion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aeropuerto {

    private String nombre;
    private String apellido;
    private String direccion;
    private String codigo_internacional;
    private int capacidad_operativa;

    // Map de hangares
    private Map<TIPO_HANGAR, List<Avion>> hangares;

    //Constructor
    public Aeropuerto(String nombre, String apellido, String direccion, String codigo_internacional, int capacidad_operativa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.codigo_internacional = codigo_internacional;
        this.capacidad_operativa = capacidad_operativa;

        // Inicializar hangares
        this.hangares = new HashMap<>();
        for (TIPO_HANGAR tipo : TIPO_HANGAR.values()) {
            hangares.put(tipo, new ArrayList<>());
        }
    }

    public Aeropuerto() {
        this.hangares = new HashMap<>();
        for (TIPO_HANGAR tipo : TIPO_HANGAR.values()) {
            hangares.put(tipo, new ArrayList<>());
        }
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public int getCapacidad_operativa() { return capacidad_operativa; }
    public void setCapacidad_operativa(int capacidad_operativa) { this.capacidad_operativa = capacidad_operativa; }

    public String getCodigo_internacional() { return codigo_internacional; }
    public void setCodigo_internacional(String codigo_internacional) { this.codigo_internacional = codigo_internacional; }

    public Map<TIPO_HANGAR, List<Avion>> getHangares() { return hangares; }

    // Agregar un avión a un hangar
    public void agregarAvion(TIPO_HANGAR tipoHangar, Avion avion) {
        int totalAviones = contarTotalAviones();
        if (totalAviones >= capacidad_operativa) {
            System.out.println("No se puede agregar el avión. Capacidad máxima del aeropuerto alcanzada: " + capacidad_operativa);
            return;
        }
        hangares.get(tipoHangar).add(avion);
        System.out.println("Avión agregado al hangar " + tipoHangar);
    }

    // Contar total de aviones en todos los hangares
    public int contarTotalAviones() {
        return hangares.values().stream().mapToInt(List::size).sum();
    }

    // Despegar todos los aviones de un hangar
    public void despegarAvionesDeHangar(TIPO_HANGAR tipoHangar) {
        List<Avion> aviones = hangares.get(tipoHangar);
        if (aviones == null || aviones.isEmpty()) {
            System.out.println("No hay aviones en el hangar " + tipoHangar);
            return;
        }
        for (Avion avion : aviones) {
            avion.despegar();
        }
    }

    // Listar aviones de un hangar
    public void listarAvionesDeHangar(TIPO_HANGAR tipoHangar) {
        List<Avion> aviones = hangares.get(tipoHangar);
        if (aviones == null || aviones.isEmpty()) {
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
        return "Aeropuerto{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", codigo_internacional='" + codigo_internacional + '\'' +
                ", capacidad_operativa=" + capacidad_operativa +
                ", hangares=" + hangares.keySet() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aeropuerto that = (Aeropuerto) o;
        return codigo_internacional != null &&
                codigo_internacional.equals(that.codigo_internacional);
    }

    @Override
    public int hashCode() {
        return codigo_internacional != null ? codigo_internacional.hashCode() : 0;
    }
}
