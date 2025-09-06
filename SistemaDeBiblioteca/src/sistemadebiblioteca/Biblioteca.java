/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadebiblioteca;

/**
 *
 * @author ORTEL
 */
 
import java.util.*;

public class Biblioteca {
    private final Map<String, Libro> catalogoPorIsbn;
    private final Map<String, Usuario> usuariosPorId;
    private final Set<String> isbnsPrestados;

    public Biblioteca() {
        catalogoPorIsbn = new HashMap<>();
        usuariosPorId = new HashMap<>();
        isbnsPrestados = new HashSet<>();
    }

    public void añadirLibro(Libro libro) {
        catalogoPorIsbn.put(libro.getIsbn(), libro);
    }

    public void quitarLibro(String isbn) {
        catalogoPorIsbn.remove(isbn);
    }

    public void registrarUsuario(Usuario u) {
        usuariosPorId.put(u.getId(), u);
    }

    public void darBajaUsuario(String id) {
        usuariosPorId.remove(id);
    }

    public void prestarLibro(String idUsuario, String isbn) {
        if (usuariosPorId.containsKey(idUsuario) && catalogoPorIsbn.containsKey(isbn)) {
            usuariosPorId.get(idUsuario).prestarLibro(isbn);
            isbnsPrestados.add(isbn);
        } else {
            System.out.println("Usuario o libro no encontrado.");
        }
    }

    public void devolverLibro(String idUsuario, String isbn) {
        if (usuariosPorId.containsKey(idUsuario) && isbnsPrestados.contains(isbn)) {
            usuariosPorId.get(idUsuario).devolverLibro(isbn);
            isbnsPrestados.remove(isbn);
        } else {
            System.out.println("Usuario o libro no encontrado.");
        }
    }

    public List<Libro> buscarPorTitulo(String texto) {
        List<Libro> resultados = new ArrayList<>();
        for (Libro libro : catalogoPorIsbn.values()) {
            if (libro.getTitulo().toLowerCase().contains(texto.toLowerCase())) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    public List<Libro> buscarPorAutor(String texto) {
        List<Libro> resultados = new ArrayList<>();
        for (Libro libro : catalogoPorIsbn.values()) {
            if (libro.getAutor().toLowerCase().contains(texto.toLowerCase())) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    public List<Libro> buscarPorCategoria(String texto) {
        List<Libro> resultados = new ArrayList<>();
        for (Libro libro : catalogoPorIsbn.values()) {
            if (libro.getCategoria().toLowerCase().contains(texto.toLowerCase())) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    public List<Libro> listarPrestados(String idUsuario) {
        List<Libro> resultados = new ArrayList<>();
        if (usuariosPorId.containsKey(idUsuario)) {
            Usuario usuario = usuariosPorId.get(idUsuario);
            for (String isbn : usuario.getIsbnsPrestados()) {
                resultados.add(catalogoPorIsbn.get(isbn));
            }
        }
        return resultados;
    }
}
