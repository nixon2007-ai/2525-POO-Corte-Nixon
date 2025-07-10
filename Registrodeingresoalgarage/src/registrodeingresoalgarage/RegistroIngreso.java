/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrodeingresoalgarage;

/**
 *
 * @author ORTEL
 */
// Clase que representa el registro de ingreso de un carro al garaje
public class RegistroIngreso {
    private Carro carro;
    private String fechaHoraIngreso;

    // Constructor por defecto
    public RegistroIngreso() {
        this.carro = new Carro();
        this.fechaHoraIngreso = "N/A";
    }

    // Constructor parametrizado
    public RegistroIngreso(Carro carro, String fechaHoraIngreso) {
        this.carro = carro;
        this.fechaHoraIngreso = fechaHoraIngreso;
    }

    // Método para mostrar el registro de ingreso
    public void mostrarRegistro() {
        System.out.println("Ingreso de carro: ");
        carro.mostrarInfo();
        System.out.println("Fecha y Hora de Ingreso: " + fechaHoraIngreso);
    }
}