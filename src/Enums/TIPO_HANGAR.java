package Enums;

public enum TIPO_HANGAR {
    HANGAR_PRIVADO("Hangar Privado"),
    HANGAR_MILITAR("Hangar Militar"),
    HANGAR_CARGA("Hangar Carga"),
    HANGAR_COMERCIAL("Hangar Comercial");

    private final String nombre;

    TIPO_HANGAR(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}