/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadebiblioteca;

/**
 *
 * @author ORTEL
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("TECNOLOGIAS DE LA INFORMACION-UEA");
        
        System.out.println("BIENVENIDOS A LA BIBLIOTECA DIGITAL DE CORTE NIXON");
        
        Biblioteca biblioteca = new Biblioteca();
        
        // Registrar usuarios
        biblioteca.registrarUsuario(new Usuario("U1", "Samanta"));
        biblioteca.registrarUsuario(new Usuario("U2", "Yoshira"));

        // Añadir libros
        biblioteca.añadirLibro(new Libro("ISBN-001", "Clean Code", "Robert C. Martin", "Software"));
        biblioteca.añadirLibro(new Libro("ISBN-002", "Effective Java", "Joshua Bloch", "Java"));

        // Prestar libros
        biblioteca.prestarLibro("U1", "ISBN-001");
        biblioteca.prestarLibro("U2", "ISBN-002");

        // Listar libros prestados de un usuario
        System.out.println("Libros prestados por Samanta:");
        for (Libro libro : biblioteca.listarPrestados("U1")) {
            System.out.println(libro.getTitulo());
        }

        // Devolver libro
        biblioteca.devolverLibro("U1", "ISBN-001");

        // Buscar libros por autor
        System.out.println("Libros de Joshua Bloch:");
        for (Libro libro : biblioteca.buscarPorAutor("Bloch")) {
            System.out.println(libro.getTitulo());
        }

        // Buscar libros por categoría
        System.out.println("Libros de categoría Software:");
        for (Libro libro : biblioteca.buscarPorCategoria("Software")) {
            System.out.println(libro.getTitulo());
        }
    }
}
