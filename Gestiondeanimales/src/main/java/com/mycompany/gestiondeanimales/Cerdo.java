/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondeanimales;

/**
 *
 * @author ORTEL
 */
// Clase derivada: Cerdo
class Cerdo extends Animal {
    // Atributo adicional
    private final String raza;

    // Constructor
    public Cerdo(String nombre, int edad, String raza) {
        super(nombre, edad); // Llamada al constructor de la clase base
        this.raza = raza;
    }

    // Sobrescritura del método hacerSonido
    @Override
    public String hacerSonido() {
        return "¡Oink! ¡Oink!";
    }

    // Método para mostrar información del perro
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llamada al método de la clase base
        System.out.println("Raza: " + raza);
        System.out.println("Sonido: " + hacerSonido());
    }
}
