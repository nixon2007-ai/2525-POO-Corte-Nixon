package zoo;

/**
 * Clase que representa un animal en el zoológico.
 */
public class Animal {
    private final String name;
    private final String species;
    private final int age;

    /**
     * Constructor de la clase Animal.
     *
     * @param name    Nombre del animal.
     * @param species Especie del animal.
     * @param age     Edad del animal.
     */
    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal: " + name + ", Especie: " + species + ", Edad: " + age + " años";
    }
}