package org.example;

import java.time.LocalDate;

public class Factura {
    private String numeroFactura;
    private LocalDate fechaEmision;
    private double subtotal;
    private double iva = 0.12;
    private double total;
    private String ruc;
}
