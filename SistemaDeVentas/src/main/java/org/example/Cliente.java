package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario{
    private String direccion;
    private String telefono;
    private List<Reserva> reservas = new ArrayList<>(); //RELACION BIDIRECCIONAL * CON LA CLASE RESERVA

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
    @Override
    public void iniciarSesion(){
        System.out.println("Iniciando Sesion cliente-..... ");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Cerrando Sesion cliente-..... ");
    }

    @Override
    public void modificarDatos() {
        System.out.println("Modificando Sesion cliente-..... ");
    }

}
