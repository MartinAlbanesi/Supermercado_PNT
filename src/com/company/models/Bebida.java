package com.company.models;

public class Bebida extends Producto {
    private Double litros;

    //CONSTRUCTOR
    public Bebida(String nombre, Double litros, Integer precio) {
        super(nombre, precio);
        this.litros = litros;
    }

    //GETTERS Y SETTERS
    public Double getLitros() {return litros;}

    public void setLitros(Double litros) {this.litros = litros;}

    //Sobreescritura del método toString para que muestre el producto por pantalla con otro formato.
    //El operador ternario se encarga de mostrar la unidad en litros o mililitros dependiendo del valor ingresado en LITROS.
    public String toString() {
        double mililitros = litros * 1000; //Convierte los litros a mililitros
        String unidad = litros < 1 ? " /// Mililitros: " + (int) mililitros : " /// Litros: " + (litros % 1 == 0 ? litros.intValue() : litros);
        return "Nombre: " + super.getNombre() + unidad + " /// Precio: $" + super.getPrecio();
    }
}
