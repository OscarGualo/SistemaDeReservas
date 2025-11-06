package org.example;

import java.time.LocalDate;
import java.util.List;

public class Reserva {
    private String codigoReserva;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private EstadoReserva estado;
    private List<Habitacion> habitaciones;
    private Paquete paquete;
    private Cliente cliemte;


}
