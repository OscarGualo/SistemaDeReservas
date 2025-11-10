package org.example;

public class Habitacion {
    private int numero;
    private int piso;
    private int capacidadPersonas;
    private double precioPorNoche;
    private EstadoHabitacion estado; //USO 1 A 1
    private TipoHabitacion tipo; //USO 1 A 1

    public Habitacion(int numero, TipoHabitacion tipo, EstadoHabitacion estado, double precioPorNoche, int capacidadPersonas, int piso) {
        this.numero = numero;
        this.tipo = tipo;
        this.estado = estado;
        this.precioPorNoche = precioPorNoche;
        this.capacidadPersonas = capacidadPersonas;
        this.piso = piso;
    }
}
