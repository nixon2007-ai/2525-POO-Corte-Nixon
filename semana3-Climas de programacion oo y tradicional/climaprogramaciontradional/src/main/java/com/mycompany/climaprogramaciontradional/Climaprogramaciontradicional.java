package com.mycompany.climaprogramaciontradional;

import java.util.Scanner;

public class Climaprogramaciontradicional {

    // Función para ingresar temperaturas diarias
    public static double[] ingresarTemperaturas() {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[7];

        System.out.println("Ingrese las temperaturas de los 7 días de la semana:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Día " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }

        return temperaturas;
    }

    // Función para calcular el promedio semanal
    public static double calcularPromedio(double[] temperaturas) {
        double suma = 0;
        for (double temp : temperaturas) {
            suma += temp;
        }
        return suma / temperaturas.length;
    }

    public static void main(String[] args) {
        double[] temperaturas = ingresarTemperaturas();
        double promedio = calcularPromedio(temperaturas);
        System.out.printf("El promedio semanal de temperatura es: %.2f°C\n", promedio);
    }
}