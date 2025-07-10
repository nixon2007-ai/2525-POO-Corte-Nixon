/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestiondeingresoalauea;

/**
 *
 * @author ORTEL
 */
// Clase principal para ejecutar el programa
public class Gestiondeingresoalauea {
    public static void main(String[] args) {
        System.out.println("Bienvenidos por medio de este SISTEMA DE GESTION DE INGRESO ALA UNIVERSIDAD presentare a los alumnos con puntajes mas altos del semestre pasado"); 
        // Creación de carreras
        Carrera ingAmbiental = new Carrera("Ingeniería Ambiental");
        Carrera biologia = new Carrera("Biologia");
        Carrera arquitectura = new Carrera("Arquitectura");
        Carrera licturismo = new Carrera("Licenciatura en turismo");

 

        // Creación de estudiantes
        Estudiante estudiante1 = new Estudiante("Juan Pérez", "Ecuador", ingAmbiental);
        
        Estudiante estudiante2 = new Estudiante("María López", "Perú", biologia);
        
        Estudiante estudiante3 = new Estudiante("Carlos Fernández", "Colombia", arquitectura);
        
        Estudiante estudiante4 = new Estudiante("Ana Gómez", "Chile", licturismo);
        
        // Mostrar información de los estudiantes
        estudiante1.mostrarInfo();
        
        estudiante2.mostrarInfo();
        
        estudiante3.mostrarInfo();
        
        estudiante4.mostrarInfo();
    }
}