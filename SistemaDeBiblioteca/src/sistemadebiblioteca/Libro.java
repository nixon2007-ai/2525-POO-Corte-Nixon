/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadebiblioteca;

/**
 *
 * @author ORTEL
 */
public class Libro {
    private final String isbn;
    private final String titulo;
    private final String autor;
    private final String categoria;

    public Libro(String isbn, String titulo, String autor, String categoria) {
        if (isbn == null || isbn.isEmpty() || titulo == null || titulo.isEmpty() ||
            autor == null || autor.isEmpty() || categoria == null || categoria.isEmpty()) {
            throw new IllegalArgumentException("Los atributos no pueden ser nulos o vacíos.");
        }
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getCategoria() { return categoria; }
}
