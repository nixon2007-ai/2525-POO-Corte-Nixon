/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrodeingresoalgarage;

/**
 *
 * @author ORTEL
 */


// Clase principal para ejecutar el programa
public class Registrodeingresoalgarage {
    public static void main(String[] args) {
        System.out.println("Bienvenidos al registro de ingreso vehicuclar al Garage LUCIMAR");
        // Crear carros
        Carro carro1 = new Carro("Toyota", "Corolla", "ABC123");
        Carro carro2 = new Carro("Honda", "Civic", "XYZ789");
        Carro carro3 = new Carro("Haval h6", "SUV", "XMK689");


        // Crear registros de ingreso
        RegistroIngreso ingreso1 = new RegistroIngreso(carro1, "2025-07-09 14:30");
        RegistroIngreso ingreso2 = new RegistroIngreso(carro2, "2025-07-10 15:00");
        RegistroIngreso ingreso3 = new RegistroIngreso(carro3, "2025-07-11 11:40");

        
        // Mostrar información de registros de ingreso
        ingreso1.mostrarRegistro();
        ingreso2.mostrarRegistro();
        ingreso3.mostrarRegistro();

    }
}
