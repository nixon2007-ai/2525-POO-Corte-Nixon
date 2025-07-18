package modelos;

/**
 * Clase que representa un animal en el zoológico.
 */
public class Animal {
    private final String nombre;
    private final String especie;

    /**
     * Constructor de la clase Animal.
     * @param nombre Nombre del animal.
     * @param especie Especie del animal.
     */
    public Animal(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    /**
     * Método para obtener el nombre del animal.
     * @return Nombre del animal.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener la especie del animal.
     * @return Especie del animal.
     */
    public String getEspecie() {
        return especie;
    }
}