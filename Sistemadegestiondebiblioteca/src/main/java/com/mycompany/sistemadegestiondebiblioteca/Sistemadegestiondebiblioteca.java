/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemadegestiondebiblioteca;

// Clase principal
public class Sistemadegestiondebiblioteca {
    public static void main(String[] args)  {
    
    // MENSAJE DE BIENVENIDA
System.out.println("HOLA BIENVENIDO TE SALUDA CORTE SALINAS NIXON DARIO") ;
System.out.println("Presentare el Sistema de Gestión de biblioteca con libros elegidos") ;
        // Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // Crear autores
        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("J.K. Rowling", "Británica");

        // Crear libros
        Libro libro1 = new Libro("Cien años de soledad", autor1, 1967);
        Libro libro2 = new Libro("Harry Potter y la piedra filosofal", autor2, 1997);

        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Mostrar información de la biblioteca
        biblioteca.mostrarInfo();
    }
}
