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

    public boolean iniciarSesion(String correo, String contrasena){
        //logica de inicio de sesion
        return false;
    };
    public void cerrarSesion(){
        //logica de cierre de sesion
        System.out.println("Sesion cerrada");  
    };
    public void modificarDatos(String nombres, String apellidos, String email){
        //logica de modificacion de datos
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
    };

}
