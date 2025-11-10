package org.example;

import java.time.LocalDate;

public class Pago {
    private double monto;
    private LocalDate fechaPago;
    private MetodoPago metodo;
    private Reserva reserva;

    public Pago (double monto, LocalDate fechaPago){
        this.monto = monto;
        this.fechaPago = fechaPago;
    }
}
