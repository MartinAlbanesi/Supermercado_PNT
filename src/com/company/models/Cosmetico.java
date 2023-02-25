package com.company.models;

public class Cosmetico extends Producto {
    private Double contenidoEnLitros;

    //CONSTRUCTOR
    public Cosmetico(String nombre, Double contenidoEnLitros, Integer precio) {
        super(nombre, precio);
        this.contenidoEnLitros = contenidoEnLitros;
    }

    //GETTERS Y SETTERS
    public Double getContenido() {
        return contenidoEnLitros;
    }

    public void setContenido(Double contenido) {
        this.contenidoEnLitros = contenido;
    }

    //Sobreescritura del método toString para que muestre el producto por pantalla con otro formato.
    //El operador ternario se encarga de mostrar el contenido en litros o mililitros dependiendo del valor ingresado en LITROS.
    public String toString() {
        double mililitros = contenidoEnLitros * 1000;
        String unidad = contenidoEnLitros < 1 ? (int) mililitros + "ml" : (contenidoEnLitros % 1 == 0 ? contenidoEnLitros.intValue() + "l" : contenidoEnLitros + "l");
        return "Nombre: " + super.getNombre() + " /// Contenido: " + unidad + " /// Precio: $" + super.getPrecio();
    }
}
