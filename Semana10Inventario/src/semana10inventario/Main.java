/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana10inventario;

import java.util.Scanner;


// Clase Main
public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario("inventario_celulares.txt");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("¡Bienvenido al Sistema de Gestión de Inventario de Celulares realizado por el estudiante CORTE SALINAS NIXON DARIO!");
            boolean continuar = true;
            while (continuar) {
                System.out.println("\nSeleccione una opción:");
                System.out.println("1. Agregar celular");
                System.out.println("2. Eliminar celular");
                System.out.println("3. Mostrar inventario");
                System.out.println("4. Salir");
                
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
                
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese el nombre del celular: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese el precio del celular: ");
                        double precio = scanner.nextDouble();
                        System.out.print("Ingrese la cantidad del celular: ");
                        int cantidad = scanner.nextInt();
                        inventario.agregarProducto(new Producto(nombre, precio, cantidad));
                    }
                    case 2 -> {
                        System.out.print("Ingrese el nombre del celular a eliminar: ");
                        String nombreEliminar = scanner.nextLine();
                        inventario.eliminarProducto(nombreEliminar);
                    }
                    case 3 -> inventario.mostrarInventario();
                    case 4 -> {
                        continuar = false;
                        System.out.println("¡Gracias por usar el sistema!");
                    }
                    default -> System.out.println("Opción no válida. Intente de nuevo.");
                }
            }
        }
    }
}
