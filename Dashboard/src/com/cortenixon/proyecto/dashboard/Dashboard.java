package com.cortenixon.proyecto.dashboard;

import com.cortenixon.proyecto.servicio.RegistroServicio;
import com.cortenixon.proyecto.vista.ConsolaVista;

import java.util.Scanner;

/**
 * Clase principal que gestiona el menú y las operaciones del sistema.
 * @author Tú
 */
public class Dashboard {

    private final RegistroServicio servicio = new RegistroServicio();
    private final ConsolaVista vista = new ConsolaVista();
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Inicia el sistema mostrando el menú principal.
     */
    public void iniciar() {
        vista.mostrarBienvenida();
        boolean continuar = true;

        while (continuar) {
            vista.mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> registrarEntrada();
                case 2 -> registrarSalida();
                case 3 -> vista.mostrarRegistros(servicio.obtenerRegistros());
                case 4 -> {
                    continuar = false;
                    System.out.println("¡Gracias por usar el sistema!");
                }
                default -> System.out.println("Opción inválida.");
            }
        }
    }

    private void registrarEntrada() {
        System.out.print("Ingrese el nombre del trabajador: ");
        String nombre = scanner.nextLine();
        servicio.registrarEntrada(nombre);
        System.out.println("Entrada registrada.");
    }

    private void registrarSalida() {
        System.out.print("Ingrese el nombre del trabajador: ");
        String nombre = scanner.nextLine();
        servicio.registrarSalida(nombre);
        System.out.println("Salida registrada.");
    }

    public static void main(String[] args) {
        new Dashboard().iniciar();
    }
}
