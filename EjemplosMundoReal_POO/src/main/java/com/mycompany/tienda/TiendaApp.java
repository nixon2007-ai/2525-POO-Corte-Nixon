package com.mycompany.tienda;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un producto en la tienda.
 */
class Producto {
    private final String nombre;
    private final double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    /**
     * Reduce el stock si hay suficiente cantidad disponible.
     * @param cantidad cantidad a reducir
     * @return true si la operación fue exitosa, false si no hay suficiente stock
     */
    public boolean vender(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            return true;
        }
        return false;
    }
}

/**
 * Clase que representa un cliente de la tienda.
 */
class Cliente {
    private final String nombre;
    private final String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}

/**
 * Clase que representa una orden de compra.
 */
class Orden {
    private final Cliente cliente;
    private final List<ItemOrden> items;
    private double total;

    public Orden(Cliente cliente) {
        this.cliente = cliente;
        this.items = new ArrayList<>();
        this.total = 0.0;
    }

    /**
     * Añade un producto a la orden con la cantidad especificada.
     * @param producto producto a añadir
     * @param cantidad cantidad deseada
     * @return true si se pudo añadir (hay stock), false si no hay suficiente stock
     */
    public boolean agregarProducto(Producto producto, int cantidad) {
        if (producto.vender(cantidad)) {
            ItemOrden item = new ItemOrden(producto, cantidad);
            items.add(item);
            total += producto.getPrecio() * cantidad;
            return true;
        } else {
            System.out.println("No hay suficiente stock para el producto: " + producto.getNombre());
            return false;
        }
    }

    /**
     * Muestra el resumen de la orden con los productos y el total a pagar.
     */
    public void mostrarResumen() {
        System.out.println("Orden para cliente: " + cliente.getNombre());
        for (ItemOrden item : items) {
            System.out.printf("- %s x%d = $%.2f\n", item.getProducto().getNombre(), item.getCantidad(),
                    item.getProducto().getPrecio() * item.getCantidad());
        }
        System.out.printf("Total a pagar: $%.2f\n", total);
    }

    // Clase interna que representa un ítem dentro de la orden
    private static class ItemOrden {
        private final Producto producto;
        private final int cantidad;

        public ItemOrden(Producto producto, int cantidad) {
            this.producto = producto;
            this.cantidad = cantidad;
        }

        public Producto getProducto() {
            return producto;
        }

        public int getCantidad() {
            return cantidad;
        }
    }
}

/**
 * Clase principal que ejecuta el programa.
 */
public class TiendaApp {
    public static void main(String[] args) {
        // Crear algunos productos
        Producto p1 = new Producto("Camiseta", 15.99, 10);
        Producto p2 = new Producto("Pantalón", 39.99, 5);
        Producto p3 = new Producto("Zapatos", 59.99, 2);
        

        // Crear cliente
        Cliente cliente = new Cliente("Nixon Corte", "cortenixon2007@gmail.com");

        // Crear orden para el cliente
        Orden orden = new Orden(cliente);

        // Agregar productos a la orden
        orden.agregarProducto(p1, 2); // 2 camisetas
        orden.agregarProducto(p3, 1); // 1 par de zapatos
        orden.agregarProducto(p2, 6); // Intento de 6 pantalones (solo hay 5 en stock)

        // Mostrar resumen de la orden
        orden.mostrarResumen();
    }
}