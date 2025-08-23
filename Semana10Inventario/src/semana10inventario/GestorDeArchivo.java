/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana10inventario;

/**
 *
 * @author ORTEL
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Clase GestorDeArchivo
public class GestorDeArchivo {
    private final String nombreArchivo;

    public GestorDeArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void guardar(List<Producto> productos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Producto producto : productos) {
                writer.write(producto.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    public List<Producto> leer() {
        List<Producto> productos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 3) {
                    String nombre = partes[0];
                    double precio = Double.parseDouble(partes[1]);
                    int cantidad = Integer.parseInt(partes[2]);
                    productos.add(new Producto(nombre, precio, cantidad));
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado, se creará uno nuevo: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return productos;
    }
}
