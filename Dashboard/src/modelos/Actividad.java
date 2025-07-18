package modelos;

/**
 * Clase que representa una actividad en el zoológico.
 */
public class Actividad {
    private final String nombre;

    /**
     * Constructor de la clase Actividad.
     * @param nombre Nombre de la actividad.
     */
    public Actividad(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el nombre de la actividad.
     * @return Nombre de la actividad.
     */
    public String getNombre() {
        return nombre;
    }
}