package org.example;

public class Habitacion {

    private String numero;
    private int piso;
    private Double precioPorNoche;
    private int capacidadPersonas;
    private String descripcion;
    private EstadoHabitacion estado;

    // ------------------ MÉTODOS ------------------

    public void cambiarEstado(String estado){
        // lógica futura
    }

    public double calcularPrecio(int numNoches, Promocion promocion){
        return 0;
    }

    public boolean verificarDisponibilidad(String fechas){
        return true;
    }
}

