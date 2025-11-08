package org.example;

import java.time.LocalDateTime;

public class RegistroSalida {
    private LocalDateTime fechaHoraSalida;
    private Recepcionista recepcionista; // quién realizó el check-out
    private Reserva reserva;
    private String observaciones;

    public void registrarSalida() {
        // Lógica para registrar la salida del cliente
    }
    public void calcularCargosExtras() {
        // Lógica para calcular cargos extras si los hay
    }
}
