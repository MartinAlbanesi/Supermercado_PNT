package com.company.models;

public class Producto implements Comparable<Producto> {
    private String nombre;
    private Integer precio;

    //CONSTRUCTOR
    public Producto(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //GETTERS Y SETTERS
    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public Integer getPrecio() {return precio;}

    public void setPrecio(Integer precio) {this.precio = precio;}

    //Sobreescritura del método compareTo para que realice la comparación según el precio de los productos
    @Override
    public int compareTo(Producto otroProducto) {
        return Double.compare(this.precio, otroProducto.precio);
    }
}

