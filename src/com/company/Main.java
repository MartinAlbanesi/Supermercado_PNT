package com.company;

import com.company.models.*;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Producto productoMasBarato;
        Producto productoMasCaro;
        List<Producto> listaProductos = Arrays.asList(
                new Bebida("Coca-Cola Zero", 1.5, 20),
                new Bebida("Coca-Cola", 1.5, 18),
                new Cosmetico("Shampoo Sedal", 0.500, 19),
                new Fruta("Frutillas", 64, UnidadDeVenta.kilo)
        );
        Supermercado supermercado = new Supermercado();

        supermercado.setProductos(listaProductos);
        supermercado.listarProductos();
        productoMasBarato = supermercado.encontrarProductoMasBarato();
        productoMasCaro = supermercado.encontrarProductoMasCaro();

        System.out.println("=============================");

        System.out.println("Producto más caro: " + productoMasCaro.getNombre());
        System.out.println("Producto más barato: " + productoMasBarato.getNombre());
    }
}
