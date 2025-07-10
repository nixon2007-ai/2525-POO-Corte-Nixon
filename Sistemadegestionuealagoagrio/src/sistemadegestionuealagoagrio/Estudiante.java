/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadegestionuealagoagrio;

/**
 *
 * @author ORTEL
 */
// Clase que representa a un estudiante
public class Estudiante {
    private String nombre;
    private String nacionalidad;
    private Carrera carrera;

    // Constructor por defecto
    public Estudiante() {
        this.nombre = "Desconocido";
        this.nacionalidad = "Desconocida";
        this.carrera = new Carrera(); // Inicializa con una carrera por defecto
    }

    // Constructor parametrizado
    public Estudiante(String nombre, String nacionalidad, Carrera carrera) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.carrera = carrera;
    }

    // Método para mostrar información del estudiante
    public void mostrarInfo() {
        System.out.println("=================================");
        System.out.println("Nombre: " + nombre);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Carrera: " + carrera.getNombre());
        System.out.println("=================================");
    }
}