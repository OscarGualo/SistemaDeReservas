package org.example;

import java.util.ArrayList;
import java.util.List;

public class Paquete {
    private String nombre;
    private String descripcion;
    private double precioBase;
    private List<Servicio> serviciosIncluidos; //REALCION ENTRE PAQUETE Y SERVICIO 1 A N
    private List<Promocion> promocionesAplicadas; //RELACION ENTRE PAQUETE Y PROMOCION 1 A N ACA SE INCLUYE COMPOSICION ENVEZ DE AGREGACION COMO ESTA EN EL DIAGGRAMA
    private List<Habitacion> habitaciones; //RELACION ENTRE PAQUETE Y HABITACION 1 A N

    public Paquete(String nombre, String descripcion, double precioBase) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.serviciosIncluidos = new ArrayList<>();
        this.promocionesAplicadas = new ArrayList<>();
        this.habitaciones = new ArrayList<>();
    }
}
