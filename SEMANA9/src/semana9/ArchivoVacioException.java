/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana9;

/**
 *
 * @author ORTEL
 */
/**
 * Clase personalizada de excepción que se lanza cuando un archivo está vacío.
 */
public class ArchivoVacioException extends Exception {

    /**
     * Constructor de la excepción.
     * 
     * @param mensaje El mensaje de error que describe la excepción.
     */
    public ArchivoVacioException(String mensaje) {
        super(mensaje);
    }
}

