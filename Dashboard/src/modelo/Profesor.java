package modelo;

/**
 * Clase que representa un profesor en la universidad.
 */
public class Profesor {
    private String nombre;
    private String especialidad;

    /**
     * Constructor de la clase Profesor.
     * 
     * @param nombre Nombre del profesor.
     * @param especialidad Especialidad del profesor.
     */
    public Profesor(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    /**
     * Obtiene el nombre del profesor.
     * 
     * @return Nombre del profesor.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la especialidad del profesor.
     * 
     * @return Especialidad del profesor.
     */
    public String getEspecialidad() {
        return especialidad;
    }
}
