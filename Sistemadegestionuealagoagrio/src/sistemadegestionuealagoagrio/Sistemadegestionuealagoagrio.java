/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadegestionuealagoagrio;

/**
 *
 * @author ORTEL
 */
// Clase principal para ejecutar el programa
public class Sistemadegestionuealagoagrio {
    public static void main(String[] args) {
        System.out.println("Bienvenidos al SISTEMA DE GESTION DE INGRESO A LA UNIVERSIDAD ESTATAL AMAZONICA (UEA)"); 
        System.out.println("Por medio de este sistema tendremos a los mejores alumnos por carrera de la SEDE-LAGO AGRIO"); 

        // Creación de carreras
        Carrera ingAmbiental = new Carrera("Ingeniería Ambiental");
        Carrera biologia = new Carrera("Biologia");
        Carrera ingAgroindustrial = new Carrera("Ingenieria Agroindustrial");
        Carrera licturismo = new Carrera("Licenciatura en turismo");
        Carrera ingAgropecuaria = new Carrera("Ingenieria Agropecuaria");


 

        // Creación de estudiantes
        Estudiante estudiante1 = new Estudiante("Juan Pérez", "Ecuador", ingAmbiental);
        
        Estudiante estudiante2 = new Estudiante("María López", "Perú", biologia);
        
        Estudiante estudiante3 = new Estudiante("Carlos Fernández", "Colombia", ingAgroindustrial);
        
        Estudiante estudiante4 = new Estudiante("Ana Gómez", "Chile", licturismo);
        
        Estudiante estudiante5 = new Estudiante("Jose Alvarado", "Ecuador", ingAgropecuaria);

        
        // Mostrar información de los estudiantes
        estudiante1.mostrarInfo();
        
        estudiante2.mostrarInfo();
        
        estudiante3.mostrarInfo();
        
        estudiante4.mostrarInfo();
    }
}