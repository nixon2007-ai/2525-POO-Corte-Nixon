/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrodeasistenciauea;

/**
 *
 * @author ORTEL
 */
// Clase principal para ejecutar el programa
public class Registrodeasistenciauea {
    public static void main(String[] args) {
        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("Juan Pérez", 20);
        Estudiante estudiante2 = new Estudiante("María López", 22);

        // Crear asistencias
        Asistencia asistencia1 = new Asistencia(estudiante1, true );
        Asistencia asistencia2 = new Asistencia(estudiante2, false, "Enfermedad");

        // Mostrar información de asistencia
        asistencia1.mostrarAsistencia();
        asistencia2.mostrarAsistencia();
    }
}