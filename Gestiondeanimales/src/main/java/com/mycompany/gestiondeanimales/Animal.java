/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondeanimales;

/**
 *
 * @author ORTEL
 */
// Clase base: Animal
class Animal {
    // Atributos encapsulados
    private final String nombre;
    private final int edad;

    // Constructor
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos para obtener la información del animal
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Método para hacer sonido (puede ser sobrescrito)
    public String hacerSonido() {
        return "El animal hace un sonido.";
    }

    // Método para mostrar información del animal
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
