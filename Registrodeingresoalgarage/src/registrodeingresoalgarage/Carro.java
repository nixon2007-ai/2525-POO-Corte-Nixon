/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrodeingresoalgarage;

/**
 *
 * @author ORTEL
 */
// Clase que representa un carro
public class Carro {
    private String marca;
    private String modelo;
    private String placa;

    // Constructor por defecto
    public Carro() {
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
        this.placa = "N/A";
    }

    // Constructor parametrizado
    public Carro(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    // Método para obtener la placa del carro
    public String getPlaca() {
        return placa;
    }

    // Método para mostrar la información del carro
    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Placa: " + placa);
    }
}
