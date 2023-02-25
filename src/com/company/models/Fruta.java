package com.company.models;

public class Fruta extends Producto {
    private UnidadDeVenta unidad;

    //CONSTRUCTOR
    public Fruta(String nombre, Integer precio, UnidadDeVenta unidad) {
        super(nombre, precio);
        this.unidad = unidad;
    }

    //GETTERS Y SETTERS
    public UnidadDeVenta getUnidad() {
        return unidad;
    }

    public void setUnidad(UnidadDeVenta unidad) {
        this.unidad = unidad;
    }

    //Sobreescritura del método toString para que muestre el producto por pantalla con otro formato.
    @Override
    public String toString() {
        return "Nombre: " + super.getNombre() + " /// Precio: $" + super.getPrecio() + " /// Unidad de Venta: " + unidad;
    }
}
