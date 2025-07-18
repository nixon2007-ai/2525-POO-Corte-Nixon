package dashboard;

import modelos.Actividad;
import modelos.Animal;
import modelos.Cuidador;
import modelos.Habitat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase Dashboard que permite gestionar tareas relacionadas con el zoológico.
 */
public class Dashboard {
    private final List<Actividad> actividades;
    private final List<Animal> animales;
    private final List<Cuidador> cuidadores;
    private Scanner scanner;

    /**
     * Constructor de la clase Dashboard.
     */
    public Dashboard() {
        actividades = new ArrayList<>();
        animales = new ArrayList<>();
        cuidadores = new ArrayList<>();
        new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    /**
     * Muestra el menú principal en consola.
     */
    public void mostrarMenu() {
        System.out.println("Bienvenido al sistema de gestión del zoológico");
        System.out.println("1. Registrar nueva actividad");
        System.out.println("2. Registrar nuevo animal");
        System.out.println("3. Registrar nuevo cuidador");
        System.out.println("4. Mostrar actividades registradas");
        System.out.println("5. Mostrar animales registrados");
        System.out.println("6. Mostrar cuidadores registrados");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");
    }

    /**
     * Registra una nueva actividad en el zoológico.
     */
    public void registrarActividad() {
        System.out.print("Ingrese el nombre de la actividad: ");
        String nombre = scanner.nextLine();
        Actividad actividad = new Actividad(nombre);
        actividades.add(actividad);
        System.out.println("Actividad registrada: " + nombre);
    }

    /**
     * Registra un nuevo animal en el zoológico.
     */
    public void registrarAnimal() {
        System.out.print("Ingrese el nombre del animal: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la especie del animal: ");
        String especie = scanner.nextLine();
        Animal animal = new Animal(nombre, especie);
        animales.add(animal);
        System.out.println("Animal registrado: " + nombre);
    }

    /**
     * Registra un nuevo cuidador en el zoológico.
     */
    public void registrarCuidador() {
        System.out.print("Ingrese el nombre del cuidador: ");
        String nombre = scanner.nextLine();
        Cuidador cuidador = new Cuidador(nombre);
        cuidadores.add(cuidador);
        System.out.println("Cuidador registrado: " + nombre);
    }

    /**
     * Muestra todas las actividades registradas.
     */
    public void mostrarActividades() {
        System.out.println("Actividades registradas:");
        for (Actividad actividad : actividades) {
            System.out.println("- " + actividad.getNombre());
        }
    }

    /**
     * Muestra todos los animales registrados.
     */
    public void mostrarAnimales() {
        System.out.println("Animales registrados:");
        for (Animal animal : animales) {
            System.out.println("- " + animal.getNombre() + " (" + animal.getEspecie() + ")");
        }
    }

    /**
     * Muestra todos los cuidadores registrados.
     */
    public void mostrarCuidadores() {
        System.out.println("Cuidadores registrados:");
        for (Cuidador cuidador : cuidadores) {
            System.out.println("- " + cuidador.getNombre());
        }
    }

    /**
     * Método principal para ejecutar el Dashboard.
     * @param args
     */
    public static void main(String[] args) {
        Dashboard dashboard = new Dashboard();
        int opcion;

        do {
            dashboard.mostrarMenu();
            opcion = Integer.parseInt(dashboard.scanner.nextLine());

            switch (opcion) {
                case 1 -> dashboard.registrarActividad();
                case 2 -> dashboard.registrarAnimal();
                case 3 -> dashboard.registrarCuidador();
                case 4 -> dashboard.mostrarActividades();
                case 5 -> dashboard.mostrarAnimales();
                case 6 -> dashboard.mostrarCuidadores();
                case 7 -> System.out.println("Saliendo del sistema. ¡Hasta luego!");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 7);
    }
}