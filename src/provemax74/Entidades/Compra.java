package provemax74.Entidades;


import java.time.LocalDate;

public class Compra {

    private int idCompra;

    private Proveedor proveedor;

    public Compra(int idCompra, Proveedor proveedor, LocalDate fecha) {
        this.idCompra = idCompra;
        this.proveedor = proveedor;
        this.fecha = fecha;
    }

    private LocalDate fecha;
}
