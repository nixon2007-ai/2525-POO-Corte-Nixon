/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana9;

/**
 *
 * @author ORTEL
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase ValidadorArchivo para verificar el estado de los archivos.
 */
public class ValidadorArchivo {

    /**
     * Verifica que el archivo no esté vacío.
     * 
     * @param nombreArchivo El nombre del archivo a verificar.
     * @throws ArchivoVacioException Si el archivo está vacío.
     */
    public void verificarNoVacio(String nombreArchivo) throws ArchivoVacioException {
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            if (reader.readLine() == null) {
                throw new ArchivoVacioException("El archivo está vacío.");
            }
        } catch (IOException e) {
            System.err.println("Error al verificar el archivo: " + e.getMessage());
        }
    }
}

