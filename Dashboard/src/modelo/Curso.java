package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un curso en la universidad.
 */
public class Curso {
    private String nombre;
    private String codigo;
    private List<Estudiante> estudiantes;

    /**
     * Constructor de la clase Curso.
     * 
     * @param nombre Nombre del curso.
     * @param codigo Código del curso.
     */
    public Curso(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.estudiantes = new ArrayList<>();
    }

    /**
     * Inscribe un estudiante en el curso.
     * 
     * @param estudiante El estudiante a inscribir.
     */
    public void inscribirEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        System.out.println("Estudiante " + estudiante.getNombre() + " inscrito en el curso " + nombre);
    }

    /**
     * Muestra la lista de estudiantes inscritos en el curso.
     */
    public void mostrarEstudiantes() {
        System.out.println("Estudiantes inscritos en el curso " + nombre + ":");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("- " + estudiante.getNombre() + " (ID: " + estudiante.getId() + ")");
        }
    }

    /**
     * Obtiene el nombre del curso.
     * 
     * @return Nombre del curso.
     */
    public String getNombre() {
        return nombre;
    }
}
