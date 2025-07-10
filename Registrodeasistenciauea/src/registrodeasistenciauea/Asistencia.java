/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrodeasistenciauea;

/**
 *
 * @author ORTEL
 */
// Clase que representa la asistencia de un estudiante
public class Asistencia {
    private Estudiante estudiante;
    private boolean presente;
    private String motivo;

    // Constructor por defecto
    public Asistencia(Estudiante estudiante1, boolean par) {
        this.estudiante = new Estudiante();
        this.presente = false;
        this.motivo = "N/A";
    }

    // Constructor parametrizado
    public Asistencia(Estudiante estudiante, boolean presente, String motivo) {
        this.estudiante = estudiante;
        this.presente = presente;
        this.motivo = motivo;
    }

    // Método para mostrar la asistencia
    public void mostrarAsistencia() {
        String estado = presente ? "Presente" : "Ausente";
        System.out.println(estudiante.getNombre() + " está " + estado + ". Motivo: " + motivo);
    }
}