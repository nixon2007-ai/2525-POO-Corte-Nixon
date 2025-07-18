package com.cortenixon.proyecto.vista;

import com.cortenixon.proyecto.modelo.Trabajador;

import java.util.List;

public class ConsolaVista {

    public void mostrarBienvenida() {
        System.out.println("=== Bienvenido al Sistema de Registro de Trabajadores de VegaSupermercados ===");
    }

    public void mostrarMenu() {
        System.out.println("\n1. Registrar entrada");
        System.out.println("2. Registrar salida");
        System.out.println("3. Ver registros");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public void mostrarRegistros(List<Trabajador> trabajadores) {
        System.out.println("\n--- Registros de Trabajadores ---");
        for (Trabajador t : trabajadores) {
            System.out.println(t);
        }
    }
}
