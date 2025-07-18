package dashboard;

import modelo.Curso;
import modelo.Estudiante;
import modelo.Profesor;
import modelo.Universidad;

import java.util.Scanner;

/**
 * Clase Dashboard que proporciona un menú para gestionar la universidad.
 */
public class Dashboard {
    private final Universidad universidad;
    private final Scanner scanner;

    /**
     * Constructor de la clase Dashboard.
     */
    public Dashboard() {
        universidad = new Universidad();
        scanner = new Scanner(System.in);
    }

    /**
     * Método principal que inicia el menú del Dashboard.
     */
    public void iniciar() {
        System.out.println("Bienvenido al sistema de gestión y registros de la Universidad Estatal Amazónica.");
        boolean continuar = true;

        while (continuar) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1 -> agregarEstudiante();
                case 2 -> agregarCurso();
                case 3 -> agregarProfesor();
                case 4 -> inscribirEstudianteEnCurso();
                case 5 -> universidad.mostrarEstudiantes();
                case 6 -> universidad.mostrarCursos();
                case 7 -> continuar = false;
                default -> System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }

        System.out.println("Gracias por usar el sistema. Adiós.");
    }

    /**
     * Muestra el menú de opciones.
     */
    private void mostrarMenu() {
        System.out.println("\nMenú:");
        System.out.println("1. Agregar estudiante");
        System.out.println("2. Agregar curso");
        System.out.println("3. Agregar profesor");
        System.out.println("4. Inscribir estudiante en curso");
        System.out.println("5. Mostrar estudiantes");
        System.out.println("6. Mostrar cursos");
        System.out.println("7. Salir");
        System.out.print("Selecciona una opción: ");
    }

    /**
     * Permite al usuario agregar un estudiante a la universidad.
     */
    private void agregarEstudiante() {
        System.out.print("Introduce los apellidos y nombres completos del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce la edad del estudiante: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Introduce el ID/numero de cédula del estudiante: ");
        String id = scanner.nextLine();

        Estudiante estudiante = new Estudiante(nombre, edad, id);
        universidad.agregarEstudiante(estudiante);
    }

    /**
     * Permite al usuario agregar un curso a la universidad.
     */
    private void agregarCurso() {
        System.out.print("Introduce el nombre del curso: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce el código del curso UEA: ");
        String codigo = scanner.nextLine();

        Curso curso = new Curso(nombre, codigo);
        universidad.agregarCurso(curso);
    }

    /**
     * Permite al usuario agregar un profesor a la universidad.
     */
    private void agregarProfesor() {
        System.out.print("Introduce el nombre del profesor: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce la especialidad del profesor: ");
        String especialidad = scanner.nextLine();

        Profesor profesor = new Profesor(nombre, especialidad);
        universidad.agregarProfesor(profesor);
    }

    /**
     * Permite al usuario inscribir un estudiante en un curso.
     */
    private void inscribirEstudianteEnCurso() {
        System.out.print("Introduce el ID del estudiante: ");
        String idEstudiante = scanner.nextLine();
        System.out.print("Introduce el nombre del curso: ");
        String nombreCurso = scanner.nextLine();

        Estudiante estudiante = null;
        for (Estudiante e : universidad.estudiantes) {
            if (e.getId().equals(idEstudiante)) {
                estudiante = e;
                break;
            }
        }

        Curso curso = null;
        for (Curso c : universidad.cursos) {
            if (c.getNombre().equals(nombreCurso)) {
                curso = c;
                break;
            }
        }

        if (estudiante != null && curso != null) {
            curso.inscribirEstudiante(estudiante);
        } else {
            System.out.println("Estudiante o curso no encontrado.");
        }
    }

    public static void main(String[] args) {
        Dashboard dashboard = new Dashboard();
        dashboard.iniciar();
    }
}
