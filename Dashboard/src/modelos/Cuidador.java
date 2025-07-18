package modelos;

/**
 * Clase que representa un cuidador en el zoológico.
 */
public class Cuidador {
    private final String nombre;

    /**
     * Constructor de la clase Cuidador.
     * @param nombre Nombre del cuidador.
     */
    public Cuidador(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el nombre del cuidador.
     * @return Nombre del cuidador.
     */
    public String getNombre() {
        return nombre;
    }
}