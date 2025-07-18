
package zoo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona los animales en el zoológico.
 */
public class AnimalManager {
    private final List<Animal> animals;

    /**
     * Constructor de la clase AnimalManager.
     */
    public AnimalManager() {
        this.animals = new ArrayList<>();
    }

    /**
     * Agrega un animal a la lista.
     *
     * @param animal Animal a agregar.
     */
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    /**
     * Muestra todos los animales registrados.
     */
    public void showAnimals() {
        if (animals.isEmpty()) {
            System.out.println("No hay animales registrados.");
            return;
        }
        System.out.println("Animales Registrados:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}