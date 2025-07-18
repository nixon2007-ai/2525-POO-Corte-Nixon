package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa la universidad, gestionando estudiantes, cursos y profesores.
 */
public class Universidad {
    public List<Estudiante> estudiantes;
    public List<Curso> cursos;
    private List<Profesor> profesores;

    /**
     * Constructor de la clase Universidad.
     */
    public Universidad() {
        estudiantes = new ArrayList<>();
        cursos = new ArrayList<>();
        profesores = new ArrayList<>();
    }

    /**
     * Agrega un estudiante a la universidad.
     * 
     * @param estudiante El estudiante a agregar.
     */
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        System.out.println("Estudiante agregado: " + estudiante.getNombre());
    }

    /**
     * Agrega un curso a la universidad.
     * 
     * @param curso El curso a agregar.
     */
    public void agregarCurso(Curso curso) {
        cursos.add(curso);
        System.out.println("Curso agregado: " + curso.getNombre());
    }

    /**
     * Agrega un profesor a la universidad.
     * 
     * @param profesor El profesor a agregar.
     */
    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
        System.out.println("Profesor agregado: " + profesor.getNombre());
    }

    /**
     * Muestra todos los estudiantes en la universidad.
     */
    public void mostrarEstudiantes() {
        System.out.println("Estudiantes en la universidad:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("- " + estudiante.getNombre() + " (ID: " + estudiante.getId() + ")");
        }
    }

    /**
     * Muestra todos los cursos en la universidad.
     */
    public void mostrarCursos() {
        System.out.println("Cursos en la universidad:");
        for (Curso curso : cursos) {
            System.out.println("- " + curso.getNombre());
        }
    }
}
