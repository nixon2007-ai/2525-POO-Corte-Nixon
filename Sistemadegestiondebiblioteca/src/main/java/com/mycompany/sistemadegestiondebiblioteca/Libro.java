/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadegestiondebiblioteca;

/**
 *
 * @author ORTEL
 */
// Clase que representa un Libro
class Libro {
    // Atributos
    String titulo;
    private Autor autor;
    private int anioPublicacion;

    // Constructor por defecto
    public Libro() {
        this.titulo = "Sin título";
        this.autor = new Autor();
        this.anioPublicacion = 0;
    }

    // Constructor parametrizado
    public Libro(String titulo, Autor autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    // Método para mostrar la información del libro
    public void mostrarInfo() {
        System.out.println("Título del Libro: " + this.titulo);
        System.out.println("Año de Publicación: " + this.anioPublicacion);
        System.out.print("Autor: ");
        this.autor.mostrarInfo();
    }
}