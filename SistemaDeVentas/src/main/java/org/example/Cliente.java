package org.example;

public class Cliente extends Usuario {
    private String direccion;
    private String preferencias;

    public Cliente(String cedula, String nombres, String apellidos, String email, String contrasena, String direccion, String preferencias) {
        super(cedula, nombres, apellidos, email, contrasena);
        this.direccion = direccion;
        this.preferencias = preferencias;
    }

    public void realizarReserva() {
        // Lógica para realizar una reserva
    }
    public void cancelarReserva() {
        // Lógica para cancelar una reserva
    }
    public void verReservas() {
        // Lógica para ver reservas
    }
    public void modificarReserva() {
        // Lógica para modificar una reserva
    }
}
