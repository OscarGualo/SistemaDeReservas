package org.example;

import java.util.Date;

public class Promocion {

    private String nombre;
    private String descripcion;
    private double porcentajeDescuento;
    private Date fechaInicio;
    private Date fechaFin;
    private boolean estaActiva;

    // ------------------ MÉTODOS ------------------

    public boolean validarPromocion(){
        return estaActiva;
    }

    public double aplicarDescuento(double monto){
        return monto;
    }
}

