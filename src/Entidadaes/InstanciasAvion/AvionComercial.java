package Entidadaes.InstanciasAvion;

import Entidadaes.Avion;
import Interfaces.IComercialAndPrivate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AvionComercial extends Avion implements IComercialAndPrivate {

    private int cantidad_azafatas;
    private List<String> servicios;

    //Constructores
    public AvionComercial(String marca, String modelo, int capacidad_combustible,
                          String tipoMotor, int cantidad_asientos, int cantidad_azafatas) {
        super(marca, modelo, capacidad_combustible, tipoMotor, cantidad_asientos);
        this.cantidad_azafatas = cantidad_azafatas;
        this.servicios = new ArrayList<>();
    }

    public AvionComercial() {
        super();
        this.servicios = new ArrayList<>();
    }

    //Implementación de la interfaz
    @Override
    public void ServirComida() {
        System.out.println("Sirviendo comida...");
    }

    @Override
    public void DarMantas() {
        System.out.println("Repartiendo mantas...");
    }

    //Métodos para manejar servicios
    public void agregarServicio(String servicio) {
        servicios.add(servicio);
    }

    public void quitarServicio(String servicio) {
        servicios.remove(servicio);
    }

    //Getters y Setters
    public List<String> getServicios() {
        return servicios;
    }

    public void setServicios(List<String> servicios) {
        this.servicios = servicios;
    }

    public int getCantidadAzafatas() {
        return cantidad_azafatas;
    }

    public void setCantidadAzafatas(int cantidad_azafatas) {
        this.cantidad_azafatas = cantidad_azafatas;
    }

    //Sobrescribir toString, equals y hashCode
    @Override
    public String toString() {
        return super.toString() + ", AvionComercial{" +
                "cantidad_azafatas=" + cantidad_azafatas +
                ", servicios=" + servicios +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AvionComercial)) return false;
        if (!super.equals(o)) return false;
        AvionComercial that = (AvionComercial) o;
        return cantidad_azafatas == that.cantidad_azafatas &&
                Objects.equals(servicios, that.servicios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cantidad_azafatas, servicios);
    }
}
