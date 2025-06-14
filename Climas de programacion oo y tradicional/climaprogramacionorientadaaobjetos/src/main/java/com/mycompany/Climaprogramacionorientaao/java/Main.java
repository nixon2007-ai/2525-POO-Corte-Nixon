package com.mycompany.Climaprogramacionorientaao.java ;

import java.util.Scanner;

class ClimaDiario {
    private double temperatura;

    // Constructor
    public ClimaDiario(double temperatura) {
        this.temperatura = temperatura;
    }

    // Método para obtener la temperatura
    public double getTemperatura() {
        return temperatura;
    }
}

class SemanaClima {
    private ClimaDiario[] temperaturas;

    // Constructor
    public SemanaClima(int dias) {
        temperaturas = new ClimaDiario[dias];
    }

    // Método para ingresar datos
    public void ingresarTemperaturas() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Ingrese la temperatura del día " + (i + 1) + ": ");
            double temp = scanner.nextDouble();
            temperaturas[i] = new ClimaDiario(temp);
        }
    }

    // Método para calcular el promedio semanal
    public double calcularPromedio() {
        double suma = 0;
        for (ClimaDiario clima : temperaturas) {
            suma += clima.getTemperatura();
        }
        return suma / temperaturas.length;
    }
}

public class Main {
    public static void main(String[] args) {
        int dias = 7; // Número de días en una semana
        SemanaClima semana = new SemanaClima(dias);
        semana.ingresarTemperaturas();
        double promedio = semana.calcularPromedio();
        System.out.println("El promedio de temperaturas de la semana es: " + promedio);
    }
}