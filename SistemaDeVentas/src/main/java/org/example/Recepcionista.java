package org.example;
import java.util.Date;

public class Recepcionista extends Usuario{
    private String codigoEmpleado;
    private Date fechaContratacion;

    private List<RegistroEntrada> registrosEntrada;
    private List<RegistroSalida> registrosSalida;

    public Recepcionista(String cedula, String nombres, String apellidos, String email, String contrasena, String codigoEmpleado, Date fechaContratacion) {
        super(cedula, nombres, apellidos, email, contrasena);
        this.codigoEmpleado = codigoEmpleado;
        this.fechaContratacion = fechaContratacion; 
    }

    public void registrarEntrada(RegistroEntrada entrada) { }
    public void registrarSalida(RegistroSalida salida) { }
    public void asignarHabitacion(Habitacion habitacion, Reserva reserva) { }
    public void registrarPago(Pago pago) { }
    public void verificarDisponibilidadHabitacion(Habitacion habitacion) { }

    @Override
    public void iniciarSesion() {
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
