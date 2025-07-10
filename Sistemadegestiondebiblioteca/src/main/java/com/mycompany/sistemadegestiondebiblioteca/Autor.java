/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadegestiondebiblioteca;

/**
 *
 * @author ORTEL
 */
// Clase que representa un Autor
class Autor {
    // Atributos
    private String nombre;
    private String nacionalidad;

    // Constructor por defecto
    public Autor() {
        this.nombre = "Sin nombre";
        this.nacionalidad = "Desconocida";
    }

    // Constructor parametrizado
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    // Método para mostrar la información del autor
    public void mostrarInfo() {
        System.out.println("Nombre del Autor: " + this.nombre);
        System.out.println("Nacionalidad: " + this.nacionalidad);
    }
}