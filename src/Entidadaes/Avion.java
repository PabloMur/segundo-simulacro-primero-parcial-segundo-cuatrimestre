package Entidadaes;

import Interfaces.IAvion;

public abstract class Avion implements IAvion {
    private String marca;
    private String modelo;
    private int capacidad_combustible;
    private String tipoMotor;
    private int cantidad_asientos;

    //Constructor
    public Avion(String marca, String modelo, int capacidad_combustible, String tipoMotor, int cantidad_asientos) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad_combustible = capacidad_combustible;
        this.tipoMotor = tipoMotor;
        this.cantidad_asientos = cantidad_asientos;
    }
    public Avion() {};

    //Setters and Getters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad_combustible() {
        return capacidad_combustible;
    }

    public void setCapacidad_combustible(int capacidad_combustible) {
        this.capacidad_combustible = capacidad_combustible;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getCantidad_asientos() {
        return cantidad_asientos;
    }

    public void setCantidad_asientos(int cantidad_asientos) {
        this.cantidad_asientos = cantidad_asientos;
    }

    //Methods
    @Override
    public void despegar() {
        System.out.println("Despegando");
    }
    @Override
    public void volar() {
        System.out.println("Volando");
    }
    @Override
    public void aterrizar(){
        System.out.println("Atorrizando");
    }


    @Override
    public String toString() {
        return "Avion{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidad_combustible=" + capacidad_combustible +
                ", tipoMotor='" + tipoMotor + '\'' +
                ", cantidad_asientos=" + cantidad_asientos +
                '}';
    }

}
