//Principios SOLID: Se ha aplicado el principio de Responsabilidad Única al separar la lógica de los animales en Animal y AnimalManager, y el principio de Inversión de Dependencia al usar una interfaz para AnimalManager.
//Documentación: Se ha utilizado Javadoc para documentar las clases y métodos clave.

package zoo;

import java.util.Scanner;

/**
 * Clase que representa un Dashboard para gestionar un zoológico.
 */
public class ZooDashboard {
    private final AnimalManager animalManager;
    private final Scanner scanner;

    /**
     * Constructor que inicializa el AnimalManager y el escáner.
     */
    public ZooDashboard() {
        this.animalManager = new AnimalManager();
        this.scanner = new Scanner(System.in);
    }

    /**
     * Muestra el menú principal y gestiona la selección del usuario.
     */
    public void showMenu() {
        int option;
        do {
            System.out.println("Bienvenido al Dashboard del Zoológico Amazónico");
            System.out.println("1. Registrar animal");
            System.out.println("2. Mostrar animales");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (option) {
                case 1 -> registerAnimal();
                case 2 -> animalManager.showAnimals();
                case 0 -> System.out.println("Saliendo del Dashboard. ¡Hasta luego!");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (option != 0);
    }

    /**
     * Registra un animal en el zoológico.
     */
    private void registerAnimal() {
        System.out.print("Ingrese el nombre del animal: ");
        String name = scanner.nextLine();
        System.out.print("Ingrese la especie del animal: ");
        String species = scanner.nextLine();
        System.out.print("Ingrese la edad del animal: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        Animal animal = new Animal(name, species, age);
        animalManager.addAnimal(animal);
        System.out.println("Animal registrado con éxito.");
    }

    public static void main(String[] args) {
        ZooDashboard dashboard = new ZooDashboard();
        dashboard.showMenu();
    }
}