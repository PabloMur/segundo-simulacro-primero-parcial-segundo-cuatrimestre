package Entidadaes.InstanciasAvion;

import Entidadaes.Avion;
import Interfaces.ICargaAndMilitar;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AvionCarga extends Avion implements ICargaAndMilitar {
    private int capacidad_de_carga;
    private List<String> posibles_productos;

    //Constructores
    public AvionCarga(String marca, String modelo, int capacidad_combustible, String tipoMotor,
                      int cantidad_asientos, int capacidad_de_carga, List<String> posibles_productos) {
        super(marca, modelo, capacidad_combustible, tipoMotor, cantidad_asientos);
        this.capacidad_de_carga = capacidad_de_carga;
        this.posibles_productos = posibles_productos != null ? posibles_productos : new ArrayList<>();
    }

    public AvionCarga(int capacidad_de_carga, List<String> posibles_productos) {
        super(); // Llama al constructor vacío de Avion
        this.capacidad_de_carga = capacidad_de_carga;
        this.posibles_productos = posibles_productos != null ? posibles_productos : new ArrayList<>();
    }

    public AvionCarga() {
        super();
        this.posibles_productos = new ArrayList<>();
    }

    //Setters y Getters
    public int getCapacidad_de_carga() {
        return capacidad_de_carga;
    }

    public void setCapacidad_de_carga(int capacidad_de_carga) {
        this.capacidad_de_carga = capacidad_de_carga;
    }

    public List<String> getPosibles_productos() {
        return posibles_productos;
    }

    public void setPosibles_productos(List<String> posibles_productos) {
        this.posibles_productos = posibles_productos != null ? posibles_productos : new ArrayList<>();
    }

    // Métodos para manejar posibles productos
    public void agregarProducto(String producto) {
        posibles_productos.add(producto);
    }

    public void quitarProducto(String producto) {
        posibles_productos.remove(producto);
    }

    public boolean contieneProducto(String producto) {
        return posibles_productos.contains(producto);
    }

    // Implementación de la interfaz ICargaAndMilitar
    @Override
    public boolean Ingresar() {
        return true;
    }

    //Metodo propio de la clase
    public void desacargar() {

        System.out.println("Desacargando...");
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + ", AvionCarga{" +
                "capacidad_de_carga=" + capacidad_de_carga +
                ", posibles_productos=" + posibles_productos +
                '}';
    }

    // equals y hashCode usando marca + modelo como identificador único
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AvionCarga)) return false;
        AvionCarga that = (AvionCarga) o;
        return Objects.equals(getMarca() + getModelo(), that.getMarca() + that.getModelo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMarca() + getModelo());
    }
}
