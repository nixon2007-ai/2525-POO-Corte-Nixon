package com.cortenixon.proyecto.servicio;

import com.cortenixon.proyecto.modelo.Trabajador;

import java.util.ArrayList;
import java.util.List;

public class RegistroServicio {
    private final List<Trabajador> trabajadores = new ArrayList<>();

    public void registrarEntrada(String nombre) {
        Trabajador t = new Trabajador(nombre);
        t.registrarEntrada();
        trabajadores.add(t);
    }

    public void registrarSalida(String nombre) {
        for (Trabajador t : trabajadores) {
            if (t.getNombre().equalsIgnoreCase(nombre) && t.getHoraSalida() == null) {
                t.registrarSalida();
                return;
            }
        }
    }

    public List<Trabajador> obtenerRegistros() {
        return trabajadores;
    }
}
