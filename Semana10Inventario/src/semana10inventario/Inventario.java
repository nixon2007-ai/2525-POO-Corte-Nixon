/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana10inventario;

/**
 *
 * @author ORTEL
 */


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Clase Inventario
public class Inventario {
    private final List<Producto> productos;
    private final GestorDeArchivo gestorDeArchivo;

    public Inventario(String nombreArchivo) {
        this.gestorDeArchivo = new GestorDeArchivo(nombreArchivo);
        this.productos = gestorDeArchivo.leer();
        // Agregar celulares iniciales si el inventario está vacío
        if (productos.isEmpty()) {
            agregarCelularesIniciales();
        }
    }

    private void agregarCelularesIniciales() {
        productos.add(new Producto("iPhone 13", 999.99, 50));
        productos.add(new Producto("Samsung Galaxy S21", 799.99, 40));
        productos.add(new Producto("Google Pixel 6", 599.99, 30));
        productos.add(new Producto("OnePlus 9", 729.99, 20));
        productos.add(new Producto("Xiaomi Mi 11", 749.99, 25));
        productos.add(new Producto("Sony Xperia 5 III", 999.99, 15));
        productos.add(new Producto("Nokia 3310", 49.99, 100));
        productos.add(new Producto("Huawei P40", 599.99, 35));
        productos.add(new Producto("Motorola Moto G Power", 249.99, 60));
        productos.add(new Producto("LG Velvet", 499.99, 20));
        productos.add(new Producto("Oppo Find X3", 999.99, 10));
        productos.add(new Producto("Realme GT", 499.99, 30));
        productos.add(new Producto("Asus ROG Phone 5", 999.99, 5));
        productos.add(new Producto("Vivo X60 Pro", 699.99, 15));
        productos.add(new Producto("ZTE Axon 20", 399.99, 25));
        
        gestorDeArchivo.guardar(productos); // Guardar los celulares iniciales en el archivo
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        gestorDeArchivo.guardar(productos);
        System.out.println("Celular agregado: " + producto.getNombre());
    }

    public void eliminarProducto(String nombre) {
        productos.removeIf(producto -> producto.getNombre().equals(nombre));
        gestorDeArchivo.guardar(productos);
        System.out.println("Celular eliminado: " + nombre);
    }

    public void mostrarInventario() {
        // Ordenar productos por nombre
        Collections.sort(productos, Comparator.comparing(Producto::getNombre));
        System.out.println("Inventario de Celulares:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
