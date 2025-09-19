import Entidadaes.*;
import Entidadaes.InstanciasAvion.*;
import Enums.TIPO_HANGAR;
import Enums.TIPO_SIST_ARMAS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Crear aeropuerto
        Aeropuerto aeropuerto = new Aeropuerto(
                "Astor Piazzolla",
                "Mar del Plata, Argentina",
                "MDQ",
                10 // Capacidad operativa
        );

        System.out.println("Bienvenido al sistema del aeropuerto " + aeropuerto.getNombre());

        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar Avión Comercial");
            System.out.println("2. Agregar Avión Privado");
            System.out.println("3. Agregar Avión de Carga");
            System.out.println("4. Agregar Avión Militar");
            System.out.println("5. Listar aviones de un Hangar");
            System.out.println("6. Despegar aviones de un Hangar");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Capacidad combustible: ");
                    int combustible = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Tipo Motor: ");
                    String tipoMotor = sc.nextLine();
                    System.out.print("Cantidad asientos: ");
                    int asientos = sc.nextInt();
                    System.out.print("Cantidad de azafatas: ");
                    int azafatas = sc.nextInt();
                    sc.nextLine();

                    AvionComercial avionComercial = new AvionComercial(
                            marca, modelo, combustible, tipoMotor, asientos, azafatas
                    );

                    aeropuerto.agregarAvion(TIPO_HANGAR.HANGAR_COMERCIAL, avionComercial);
                }
                case 2 -> {
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Capacidad combustible: ");
                    int combustible = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Tipo Motor: ");
                    String tipoMotor = sc.nextLine();
                    System.out.print("Cantidad asientos: ");
                    int asientos = sc.nextInt();
                    sc.nextLine();
                    System.out.print("¿Dispone de Jacuzzi? (true/false): ");
                    boolean jacuzzi = sc.nextBoolean();
                    sc.nextLine();
                    System.out.print("Clave WiFi: ");
                    String wifi = sc.nextLine();
                    System.out.print("¿Puede ver el Mundial? (true/false): ");
                    boolean mundial = sc.nextBoolean();
                    sc.nextLine();

                    AvionPrivado avionPrivado = new AvionPrivado(
                            marca, modelo, combustible, tipoMotor, asientos,
                            jacuzzi, wifi, mundial
                    );

                    aeropuerto.agregarAvion(TIPO_HANGAR.HANGAR_PRIVADO, avionPrivado);
                }
                case 3 -> {
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Capacidad combustible: ");
                    int combustible = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Tipo Motor: ");
                    String tipoMotor = sc.nextLine();
                    System.out.print("Cantidad asientos: ");
                    int asientos = 0; // Avión de carga
                    System.out.print("Capacidad de carga (kg): ");
                    int carga = sc.nextInt();
                    sc.nextLine();

                    List<String> productos = new ArrayList<>();
                    System.out.print("Cantidad de productos posibles a transportar: ");
                    int cantProductos = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < cantProductos; i++) {
                        System.out.print("Nombre del producto " + (i + 1) + ": ");
                        productos.add(sc.nextLine());
                    }

                    AvionCarga avionCarga = new AvionCarga(
                            marca, modelo, combustible, tipoMotor, asientos,
                            carga, productos
                    );

                    aeropuerto.agregarAvion(TIPO_HANGAR.HANGAR_CARGA, avionCarga);
                }
                case 4 -> {
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Capacidad combustible: ");
                    int combustible = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Tipo Motor: ");
                    String tipoMotor = sc.nextLine();
                    System.out.print("Cantidad asientos: ");
                    int asientos = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Sistema de armas (1: Aire-Aire, 2: Aire-Tierra): ");
                    int tipoArma = sc.nextInt();
                    sc.nextLine();
                    TIPO_SIST_ARMAS sistema = (tipoArma == 1) ? TIPO_SIST_ARMAS.AIRE_AIRE : TIPO_SIST_ARMAS.AIRE_TIERRA;
                    System.out.print("Cantidad de balas: ");
                    int balas = sc.nextInt();
                    sc.nextLine();

                    AvionMilitar avionMilitar = new AvionMilitar(
                            marca, modelo, combustible, tipoMotor, asientos,
                            sistema, balas
                    );

                    aeropuerto.agregarAvion(TIPO_HANGAR.HANGAR_MILITAR, avionMilitar);
                }
                case 5 -> {
                    System.out.println("Seleccione el hangar: 1-Privado, 2-Comercial, 3-Carga, 4-Militar");
                    int h = sc.nextInt();
                    sc.nextLine();
                    TIPO_HANGAR hangar = switch (h) {
                        case 1 -> TIPO_HANGAR.HANGAR_PRIVADO;
                        case 2 -> TIPO_HANGAR.HANGAR_COMERCIAL;
                        case 3 -> TIPO_HANGAR.HANGAR_CARGA;
                        case 4 -> TIPO_HANGAR.HANGAR_MILITAR;
                        default -> null;
                    };
                    if (hangar != null) aeropuerto.listarAvionesDeHangar(hangar);
                }
                case 6 -> {
                    System.out.println("Seleccione el hangar para despegar: 1-Privado, 2-Comercial, 3-Carga, 4-Militar");
                    int h = sc.nextInt();
                    sc.nextLine();
                    TIPO_HANGAR hangar = switch (h) {
                        case 1 -> TIPO_HANGAR.HANGAR_PRIVADO;
                        case 2 -> TIPO_HANGAR.HANGAR_COMERCIAL;
                        case 3 -> TIPO_HANGAR.HANGAR_CARGA;
                        case 4 -> TIPO_HANGAR.HANGAR_MILITAR;
                        default -> null;
                    };
                    if (hangar != null) aeropuerto.despegarAvionesDeHangar(hangar);
                }
                case 0 -> {
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                }
                default -> System.out.println("Opción inválida");
            }
        }

        sc.close();
    }
}
