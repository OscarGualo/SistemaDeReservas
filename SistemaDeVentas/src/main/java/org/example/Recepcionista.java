package org.example;

public class Recepcionista extends Usuario{
    private String codigoEmpleado;

    public Recepcionista(String cedula, String nombres, String apellidos, String email, String contrasena) {
        super(cedula, nombres, apellidos, email, contrasena);
    }
}
