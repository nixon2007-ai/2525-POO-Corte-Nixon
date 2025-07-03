/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestiondeanimales;

/**
 *
 * @author ORTEL
 */
public class Gestiondeanimales {

    public static void main(String[] args) {
        
    System.out.println("¡Bienvenido al sistema de gestión de animales creado por Nixon Corte!");

        // Creación de instancias de Animal, Perro y Gato
        Animal animal1 = new Animal("Animal Genérico", 5);
        Perro perro1 = new Perro("Zeus", 3, "Labrador");
        Gato gato1 = new Gato("Luna", 1, "Blanco con manchas negras");
        Cerdo cerdo1 = new Cerdo("Pepito", 1, "Mangalica");

        // Uso de métodos
        System.out.println("Información del animal:");
        animal1.mostrarInfo(); // Muestra información del animal base

        System.out.println("\nInformación del perro:");
        perro1.mostrarInfo(); // Muestra información del perro

        System.out.println("\nInformación del gato:");
        gato1.mostrarInfo(); // Muestra información del gato
        
        System.out.println("\nInformación del cerdo:");
        cerdo1.mostrarInfo(); // Muestra información del cerdo
    }
}