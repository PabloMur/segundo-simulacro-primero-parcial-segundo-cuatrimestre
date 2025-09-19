package Entidadaes.InstanciasAvion;

import Entidadaes.Avion;
import Enums.TIPO_SIST_ARMAS;
import Interfaces.ICargaAndMilitar;

public class AvionMilitar extends Avion implements ICargaAndMilitar {
    private TIPO_SIST_ARMAS tipoMilitar;
    private int cantidadBalas;

    // Constructor completo
    public AvionMilitar(String marca, String modelo, int capacidad_combustible,
                        String tipoMotor, int cantidad_asientos,
                        TIPO_SIST_ARMAS tipoMilitar, int cantidadBalas) {
        super(marca, modelo, capacidad_combustible, tipoMotor, cantidad_asientos);
        this.tipoMilitar = tipoMilitar;
        this.cantidadBalas = cantidadBalas;
    }

    // Getters y setters
    public TIPO_SIST_ARMAS getTipoMilitar() {
        return tipoMilitar;
    }

    public void setTipoMilitar(TIPO_SIST_ARMAS tipoMilitar) {
        this.tipoMilitar = tipoMilitar;
    }

    public int getCantidadBalas() {
        return cantidadBalas;
    }

    public void setCantidadBalas(int cantidadBalas) {
        this.cantidadBalas = cantidadBalas;
    }

    @Override
    public boolean Ingresar() {
        return true;
    }

    @Override
    public String toString() {
        return "AvionMilitar{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", combustible=" + getCapacidad_combustible() +
                ", motor='" + getTipoMotor() + '\'' +
                ", asientos=" + getCantidad_asientos() +
                ", sistema=" + tipoMilitar +
                ", balas=" + cantidadBalas +
                '}';
    }
}
