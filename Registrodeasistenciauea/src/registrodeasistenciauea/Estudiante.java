/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrodeasistenciauea;

/**
 *
 * @author ORTEL
 */
// Clase que representa a un estudiante
public class Estudiante {
    private String nombre;
    private int edad;

    // Constructor por defecto
    public Estudiante() {
        this.nombre = "Desconocido";
        this.edad = 0;
    }

    // Constructor parametrizado
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para obtener el nombre del estudiante
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la edad del estudiante
    public int getEdad() {
        return edad;
    }

    // Método para mostrar la información del estudiante
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}