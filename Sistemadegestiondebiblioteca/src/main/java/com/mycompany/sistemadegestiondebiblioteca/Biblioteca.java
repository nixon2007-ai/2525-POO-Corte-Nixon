/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadegestiondebiblioteca;

/**
 *
 * @author ORTEL
 */
// Clase que representa una Biblioteca
class Biblioteca {
    // Atributos
    private String nombreBiblioteca;
    private Libro[] libros;
    private int contadorLibros;

    // Constructor por defecto
    public Biblioteca() {
        this.nombreBiblioteca = "Sin nombre";
        this.libros = new Libro[100];
        this.contadorLibros = 0;
    }

    // Constructor parametrizado
    public Biblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
        this.libros = new Libro[100];
        this.contadorLibros = 0;
    }

    // Método para agregar un libro
    public void agregarLibro(Libro libro) {
        if (contadorLibros < libros.length) {
            libros[contadorLibros++] = libro;
            System.out.println("Libro '" + libro.titulo + "' agregado a la biblioteca.");
        } else {
            System.out.println("No se pueden agregar más libros.");
        }
    }

    // Método para mostrar información de la biblioteca
    public void mostrarInfo() {
        System.out.println("Biblioteca: " + this.nombreBiblioteca);
        System.out.println("Libros disponibles:");
        for (int i = 0; i < contadorLibros; i++) {
            libros[i].mostrarInfo();
            System.out.println();
        }
    }
}
