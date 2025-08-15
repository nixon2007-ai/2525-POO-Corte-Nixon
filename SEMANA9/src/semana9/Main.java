/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana9;

/**
 *
 * @author ORTEL
 */
 // Clase principal para ejecutar el programa.
public class Main {

    public static void main(String[] args) {
        GestorDeArchivo gestor = new GestorDeArchivo();
        ValidadorArchivo validador = new ValidadorArchivo();
        String nombreArchivo = "ejemplo.txt";
        String contenido = "Hola, este es un ejemplo de contenido desarrollado por el estudiante Corte Salinas Nixon Dario.";

        // Guardar contenido en el archivo
        gestor.guardar(nombreArchivo, contenido);
        
        // Leer el contenido del archivo
        String contenidoLeido = gestor.leer(nombreArchivo);
        System.out.println("Contenido leído del archivo:");
        System.out.println(contenidoLeido);

        // Verificar si el archivo está vacío
        try {
            validador.verificarNoVacio(nombreArchivo);
            System.out.println("El archivo no está vacío.");
        } catch (ArchivoVacioException e) {
            System.err.println(e.getMessage());
        }
    }
}
