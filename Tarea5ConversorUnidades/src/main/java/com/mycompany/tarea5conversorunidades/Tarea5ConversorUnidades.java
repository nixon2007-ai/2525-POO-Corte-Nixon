package com.mycompany.tarea5conversorunidades;

/**
 * Este programa convierte unidades de medida entre metros y pies.
 * Permite al usuario ingresar un valor en metros y lo convierte a pies,
 * o un valor en pies y lo convierte a metros.
 */

import java.util.Scanner;

public class Tarea5ConversorUnidades {

    public static void main(String[] args) {
        // Mensaje de autor
        System.out.println("BIENVENIDOS A ESTE PROGRAMA");

        // Declaración de variables
        float valor; // Valor a convertir
        String unidad; // Unidad de medida ingresada por el usuario
        boolean continuar = true; // Controla el bucle del programa
        String nombre; // Nombre del usuario

        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del usuario
        System.out.print("Ingrese su nombre: ");
        nombre = scanner.nextLine();

        while (continuar) {
            // Solicitar al usuario que ingrese un valor y la unidad
            System.out.print("Ingrese el valor a convertir: ");
            valor = scanner.nextFloat();
            System.out.print("Ingrese la unidad (metros o pies): ");
            unidad = scanner.next().toLowerCase();

            // Lógica de conversión
            if (unidad.equals("metros")) {
                float resultado = convertirMetrosAPies(valor);
                System.out.printf("%s, %.2f metros son %.2f pies.%n", nombre, valor, resultado);
            } else if (unidad.equals("pies")) {
                float resultado = convertirPiesAMetros(valor);
                System.out.printf("%s, %.2f pies son %.2f metros.%n", nombre, valor, resultado);
            } else {
                System.out.println("Unidad no válida. Por favor, ingrese 'metros' o 'pies'.");
            }

            // Preguntar al usuario si desea continuar
            System.out.print("¿Desea realizar otra conversión? (true/false): ");
            continuar = scanner.nextBoolean();
        }

        // Cerrar el escáner
        scanner.close();
        System.out.println("Programa finalizado.");
    }

    /**
     * Convierte metros a pies.
     *
     * @param metros el valor en metros
     * @return el valor convertido en pies
     */
    public static float convertirMetrosAPies(float metros) {
        return metros * 3.28084f; // 1 metro = 3.28084 pies
    }

    /**
     * Convierte pies a metros.
     *
     * @param pies el valor en pies
     * @return el valor convertido en metros
     */
    public static float convertirPiesAMetros(float pies) {
        return pies / 3.28084f; // 1 pie = 0.3048 metros
    }
}