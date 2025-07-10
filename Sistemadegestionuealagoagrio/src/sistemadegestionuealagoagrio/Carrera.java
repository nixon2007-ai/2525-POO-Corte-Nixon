/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadegestionuealagoagrio;

/**
 *
 * @author ORTEL
 */
// Clase que representa una carrera
public class Carrera {
    private String nombre;

    // Constructor por defecto
    public Carrera() {
        this.nombre = "Carrera Desconocida";
    }

    // Constructor parametrizado
    public Carrera(String nombre) {
        this.nombre = nombre;
    }

    // Getter para el nombre de la carrera
    public String getNombre() {
        return nombre;
    }
}

