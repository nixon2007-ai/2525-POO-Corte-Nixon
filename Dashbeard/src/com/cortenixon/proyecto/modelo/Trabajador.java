package com.cortenixon.proyecto.modelo;

import java.time.LocalDateTime;

public class Trabajador {
    private final String nombre;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;

    public Trabajador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public void registrarEntrada() {
        this.horaEntrada = LocalDateTime.now();
    }

    public void registrarSalida() {
        this.horaSalida = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Trabajador: " + nombre + ", Entrada: " + horaEntrada + ", Salida: " + horaSalida;
    }
}
