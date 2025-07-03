/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondeanimales;

/**
 *
 * @author ORTEL
 */
// Clase derivada: Gato
class Gato extends Animal {
    // Atributo adicional
    private final String color;

    // Constructor
    public Gato(String nombre, int edad, String color) {
        super(nombre, edad); // Llamada al constructor de la clase base
        this.color = color;
    }

    // Sobrescritura del método hacerSonido
    @Override
    public String hacerSonido() {
        return "¡Miau! ¡Miau!";
    }

    // Método para mostrar información del gato
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llamada al método de la clase base
        System.out.println("Color: " + color);
        System.out.println("Sonido: " + hacerSonido());
    }
}
