/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buggyactividadsinerror;


import java.util.*;

public class BuggyActividadSinError {

    public static void main(String[] args) {

        // LISTA de nombres
        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Ana");

        // Corrección: evitar índice fuera de rango
        if (nombres.size() > 3) {
            System.out.println("Elemento en posición 3: " + nombres.get(3));
        } else {
            System.out.println("No hay elemento en la posición 3.");
        }

        // Corrección: comparación de cadenas con equals
        String buscado = "Ana";
        if (buscado.equals("Ana")) {
            System.out.println("Encontrado");
        }

        // MAPA de teléfonos
        Map<String, String> telefonos = new HashMap<>();
        telefonos.put("Ana", "0991111111");
        telefonos.put("Luis", "0992222222");
        telefonos.put("Ana", "0993333333"); // sobrescribe sin control

        // Corrección: validar existencia de clave
        if (telefonos.containsKey("Bea")) {
            System.out.println("Bea: " + telefonos.get("Bea"));
        } else {
            System.out.println("Bea no está en el mapa.");
        }

        // SET de inscritos (evitar duplicados lógicos)
        Set<Alumno> inscritos = new HashSet<>();
        inscritos.add(new Alumno(1, "Ana"));
        inscritos.add(new Alumno(2, "Luis"));
        inscritos.add(new Alumno(1, "Ana")); // duplicado lógico

        System.out.println("Tamaño del Set: " + inscritos.size());
        System.out.println(inscritos);
    }
}