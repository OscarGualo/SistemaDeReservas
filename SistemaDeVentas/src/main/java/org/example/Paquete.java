package org.example;

import java.util.ArrayList;

public class Paquete {

    private String nombre;
    private String descripcion;
    private Double precioBase;
    private double descuentoPaquete;

    // Agregación (*)
    public ArrayList<Servicio> servicio = new ArrayList<>();

    // Agregación (*)
    public ArrayList<Promocion> promocion = new ArrayList<>();

    // Agregación (1..*)
    public ArrayList<Habitacion> habitacion = new ArrayList<>();

    // ------------------ MÉTODOS ------------------

    public double calcularPrecioTotal(){
        // lógica futura
        return 0;
    }

    public void agregarServicio(Servicio servicio){
        // lógica futura
    }

    public void quitarServicio(Servicio servicio){
        // lógica futura
    }

    public void aplicarPromocion(Promocion promocion){
        // lógica futura
    }

    public boolean verificarDisponibilidad(String fechas){
        return true;
    }
}

