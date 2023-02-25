package com.company.models;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    private List<Producto> productos;

    //CONSTRUCTOR
    public Supermercado() {
        this.productos = new ArrayList<>();
    }

    //GETTERS Y SETTERS
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    //MÉTODOS
    //Listado por consola de todos los productos del supermercado
    public void listarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto.toString());
        }
    }

    //Compara todos los productos de la lista y devuelve el que tenga el menor precio. En caso de haber 2 o más productos con el menor precio devuelve el primero
    public Producto encontrarProductoMasBarato() {
        Producto productoConPrecioMinimo = productos.get(0);
        for (Producto producto : productos) {
            if (producto.compareTo(productoConPrecioMinimo) < 0) {
                productoConPrecioMinimo = producto;
            }
        }
        return productoConPrecioMinimo;
    }

    //Compara todos los productos de la lista y devuelve el que tenga el mayor precio. En caso de haber 2 o más productos con el mayor precio devuelve el primero
    public Producto encontrarProductoMasCaro() {
        Producto productoConPrecioMaximo = productos.get(0);
        for (Producto producto : productos) {
            if (producto.compareTo(productoConPrecioMaximo) > 0) {
                productoConPrecioMaximo = producto;
            }
        }
        return productoConPrecioMaximo;
    }
}
