package Entidadaes.InstanciasAvion;

import Entidadaes.Avion;
import Interfaces.IComercialAndPrivate;

import java.util.Objects;

public class AvionPrivado extends Avion implements IComercialAndPrivate {
    private boolean dispone_jacuzzi;
    private String clave_wifi;
    private boolean ver_mundial;

    //Constructores
    public AvionPrivado(String marca, String modelo, int capacidad_combustible, String tipoMotor, int cantidad_asientos,
                        boolean dispone_jacuzzi, String clave_wifi, boolean ver_mundial) {
        super(marca, modelo, capacidad_combustible, tipoMotor, cantidad_asientos);
        this.dispone_jacuzzi = dispone_jacuzzi;
        this.clave_wifi = clave_wifi;
        this.ver_mundial = ver_mundial;
    }

    public AvionPrivado(boolean dispone_jacuzzi, String clave_wifi, boolean ver_mundial) {
        super(); // Llama al constructor vacío de Avion
        this.dispone_jacuzzi = dispone_jacuzzi;
        this.clave_wifi = clave_wifi;
        this.ver_mundial = ver_mundial;
    }

    public AvionPrivado() {}

    //Setters y Getters
    public boolean isDispone_jacuzzi() {
        return dispone_jacuzzi;
    }

    public void setDispone_jacuzzi(boolean dispone_jacuzzi) {
        this.dispone_jacuzzi = dispone_jacuzzi;
    }

    public String getClave_wifi() {
        return clave_wifi;
    }

    public void setClave_wifi(String clave_wifi) {
        this.clave_wifi = clave_wifi;
    }

    public boolean isVer_mundial() {
        return ver_mundial;
    }

    public void setVer_mundial(boolean ver_mundial) {
        this.ver_mundial = ver_mundial;
    }

    //Implementación de los métodos de IComercialAndPrivate
    @Override
    public void ServirComida() {
        System.out.println("Sirviendo comida en el avión privado.");
    }

    @Override
    public void DarMantas() {
        System.out.println("Entregando mantas a los pasajeros.");
    }

    //Métodos heredados de Avion ya implementados: despegar(), volar(), aterrizar()

    @Override
    public String toString() {
        return super.toString() + ", AvionPrivado{" +
                "dispone_jacuzzi=" + dispone_jacuzzi +
                ", clave_wifi='" + clave_wifi + '\'' +
                ", ver_mundial=" + ver_mundial +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AvionPrivado that = (AvionPrivado) o;
        return dispone_jacuzzi == that.dispone_jacuzzi &&
                ver_mundial == that.ver_mundial &&
                Objects.equals(clave_wifi, that.clave_wifi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dispone_jacuzzi, clave_wifi, ver_mundial);
    }
}
