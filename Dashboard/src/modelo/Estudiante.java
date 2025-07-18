package modelo;

/**
 * Clase que representa un estudiante en la universidad.
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private String id;

    /**
     * Constructor de la clase Estudiante.
     * 
     * @param nombre Nombre del estudiante.
     * @param edad Edad del estudiante.
     * @param id Identificación del estudiante.
     */
    public Estudiante(String nombre, int edad, String id) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
    }

    /**
     * Obtiene el nombre del estudiante.
     * 
     * @return Nombre del estudiante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la identificación del estudiante.
     * 
     * @return ID del estudiante.
     */
    public String getId() {
        return id;
    }
}
