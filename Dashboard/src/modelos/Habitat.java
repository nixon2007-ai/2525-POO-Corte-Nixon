package modelos;

/**
 * Clase que representa un hábitat en el zoológico.
 */
public class Habitat {
    private final String nombre;
    private final String tipo;

    /**
     * Constructor de la clase Habitat.
     * @param nombre Nombre del hábitat.
     * @param tipo Tipo de hábitat (ejemplo: selva, desierto).
     */
    public Habitat(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    /**
     * Método para obtener el nombre del hábitat.
     * @return Nombre del hábitat.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener el tipo de hábitat.
     * @return Tipo de hábitat.
     */
    public String getTipo() {
        return tipo;
    }
}