package org.example;

public abstract class Usuario {
    private String cedula;
    private String nombres;
    private String apellidos;
    private String email;
    private String contrasena;

    public Usuario(String cedula, String nombres, String apellidos, String email, String contrasena) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.contrasena = contrasena;
    }

    public abstract void iniciarSesion();
    public abstract void cerrarSesion();
    public abstract void modificarDatos();
}
