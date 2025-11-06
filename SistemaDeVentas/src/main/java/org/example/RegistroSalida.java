package org.example;

import java.time.LocalDateTime;

public class RegistroSalida {
    private LocalDateTime fechaHoraSalida;
    private Recepcionista recepcionista; // quién realizó el check-out
    private Reserva reserva;
    private String observaciones;
}
