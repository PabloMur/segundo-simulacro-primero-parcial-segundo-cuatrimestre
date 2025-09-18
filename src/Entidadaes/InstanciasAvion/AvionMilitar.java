package Entidadaes.InstanciasAvion;

import Entidadaes.Avion;
import Enums.TIPO_SIST_ARMAS;
import Interfaces.ICargaAndMilitar;

public class AvionMilitar extends Avion implements ICargaAndMilitar {
    private Enum<TIPO_SIST_ARMAS> tipoMilitar;

    //Constructors
    public AvionMilitar(String marca, String modelo, int capacidad_combustible, String tipoMotor, int cantidad_asientos, Enum<TIPO_SIST_ARMAS> tipoMilitar) {
        super(marca, modelo, capacidad_combustible, tipoMotor, cantidad_asientos);
        this.tipoMilitar = tipoMilitar;
    }

    public AvionMilitar(Enum<TIPO_SIST_ARMAS> tipoMilitar) {
        super();
        this.tipoMilitar = tipoMilitar;
    }

    public AvionMilitar() {}

    public AvionMilitar(String marca, String modelo, int combustible, String tipoMotor, int asientos, TIPO_SIST_ARMAS sistema, int balas) {
    }

    //Setters and Getters
    public Enum<TIPO_SIST_ARMAS> getTipoMilitar() {
        return tipoMilitar;
    }

    public void setTipoMilitar(Enum<TIPO_SIST_ARMAS> tipoMilitar) {
        this.tipoMilitar = tipoMilitar;
    }

    @Override
    public boolean Ingresar() {
        return true;
    }
}
