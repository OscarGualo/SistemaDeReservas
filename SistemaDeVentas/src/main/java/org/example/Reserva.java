package org.example;

import java.time.LocalDate;
import java.util.List;

public class Reserva {
    private String codigoReserva;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private EstadoReserva estado;
    private List<Habitacion> habitaciones; // relacion de agreagacion 1 a 1 o 1 a n
    private Paquete paquete; // Relacion de agregacion 1 a n
    private Cliente cliente; // Relacion de asociacion 1 a n

    public Reserva(String codigoReserva, LocalDate fechaEntrada, LocalDate fechaSalida, EstadoReserva estado, List<Habitacion> habitaciones, Paquete paquete) {
        this.codigoReserva = codigoReserva;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.estado = estado;
        this.habitaciones = habitaciones;
        this.paquete = paquete;
        this.cliente = cliente;
    }
}
