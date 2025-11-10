package org.example;

public class Administrador extends Usuario{

    public Administrador(String cedula, String nombres, String apellidos, String email, String contrasena) {
        super(cedula, nombres, apellidos, email, contrasena);
    }

    public void gestionarHabitaciones() {
        // Lógica para gestionar habitaciones
    }   
    public void gestionarPromociones() {
        // Lógica para gestionar promociones
    }       
    public void gestionarServicios() {
        // Lógica para gestionar servicios
    }
    
    @Override
    public void iniciarSesion(){
        System.out.println("Iniciando Sesion administrador.....");
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
