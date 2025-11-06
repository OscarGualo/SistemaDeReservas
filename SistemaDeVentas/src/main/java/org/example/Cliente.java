package org.example;

public class Cliente extends Usuario{
    private String direccion;
    private String telefono;

    public Cliente(String cedula, String nombres, String apellidos, String email, String contrasena) {
        super(cedula, nombres, apellidos, email, contrasena);
    }
}
