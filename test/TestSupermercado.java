import com.company.models.*;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestSupermercado {

    @Test
    public void queSePuedaCrearUnProducto() {
        //Preparacion
        Producto productoPrueba;
        final String NOMBRE_ESPERADO = "Coca-Cola Zero";
        final Double LITROS_ESPERADO = 1.5;
        final Integer PRECIO_ESPERADO = 20;

        //Ejecucion
        productoPrueba = new Bebida(NOMBRE_ESPERADO, LITROS_ESPERADO, PRECIO_ESPERADO);

        //Validacion
        assertNotNull(productoPrueba);
    }

    @Test
    public void queSePuedaCrearUnSupermercado() {
        //Preparacion
        Supermercado supermercadoPrueba;

        //Ejecucion
        supermercadoPrueba = new Supermercado();

        //Validacion
        assertNotNull(supermercadoPrueba);
    }

    @Test
    public void queSePuedaAgregarProductosDeDistintosTiposAlSupermercado() {
        //Preparacion
        List<Producto> listaProductosDePrueba;
        final String NOMBRE_ESPERADO1 = "Coca-Cola Zero";
        final Double LITROS_ESPERADO1 = 1.5;
        final Integer PRECIO_ESPERADO1 = 20;
        final String NOMBRE_ESPERADO2 = "Shampoo Sedal";
        final Double CONTENIDO_ESPERADO2 = 0.500;
        final Integer PRECIO_ESPERADO2 = 19;
        final String NOMBRE_ESPERADO3 = "Frutillas";
        final Integer PRECIO_ESPERADO3 = 64;
        final UnidadDeVenta UNIDAD_DE_VENTA_ESPERADO3 = UnidadDeVenta.kilo;
        final Integer CANTIDAD_PRODUCTOS_ESPERADOS = 3;
        Supermercado supermercadoPrueba;

        //Ejecucion
        listaProductosDePrueba = List.of(
                new Bebida(NOMBRE_ESPERADO1, LITROS_ESPERADO1, PRECIO_ESPERADO1),
                new Cosmetico(NOMBRE_ESPERADO2, CONTENIDO_ESPERADO2, PRECIO_ESPERADO2),
                new Fruta(NOMBRE_ESPERADO3, PRECIO_ESPERADO3, UNIDAD_DE_VENTA_ESPERADO3)
        );
        supermercadoPrueba = new Supermercado();
        supermercadoPrueba.setProductos(listaProductosDePrueba);

        //Validacion
        assertEquals(CANTIDAD_PRODUCTOS_ESPERADOS, (Integer) supermercadoPrueba.getProductos().size());
    }

    @Test
    public void quePuedaEncontrarElProductoMasCaroYElMasBarato() {
        //Preparacion
        List<Producto> listaProductosDePrueba;
        final String NOMBRE_ESPERADO1 = "Coca-Cola Zero";
        final Double LITROS_ESPERADO1 = 1.5;
        final Integer PRECIO_ESPERADO1 = 20;
        final String NOMBRE_ESPERADO2 = "Coca-Cola";
        final Double LITROS_ESPERADO2 = 1.5;
        final Integer PRECIO_ESPERADO2 = 18;
        final String NOMBRE_ESPERADO3 = "Shampoo Sedal";
        final Double CONTENIDO_ESPERADO3 = 0.500;
        final Integer PRECIO_ESPERADO3 = 19;
        final String NOMBRE_ESPERADO4 = "Frutillas";
        final Integer PRECIO_ESPERADO4 = 64;
        final UnidadDeVenta UNIDAD_DE_VENTA_ESPERADO4 = UnidadDeVenta.kilo;
        final String PRODUCTO_MAS_CARO_ESPERADO = "Frutillas";
        final String PRODUCTO_MAS_BARATO_ESPERADO = "Coca-Cola";
        Producto productoMasCaro;
        Producto productoMasBarato;
        Supermercado supermercadoPrueba;

        //Ejecucion
        listaProductosDePrueba = List.of(
                new Bebida(NOMBRE_ESPERADO1, LITROS_ESPERADO1, PRECIO_ESPERADO1),
                new Bebida(NOMBRE_ESPERADO2,LITROS_ESPERADO2,PRECIO_ESPERADO2),
                new Cosmetico(NOMBRE_ESPERADO3, CONTENIDO_ESPERADO3, PRECIO_ESPERADO3),
                new Fruta(NOMBRE_ESPERADO4, PRECIO_ESPERADO4, UNIDAD_DE_VENTA_ESPERADO4)
        );
        supermercadoPrueba = new Supermercado();
        supermercadoPrueba.setProductos(listaProductosDePrueba);
        productoMasCaro = supermercadoPrueba.encontrarProductoMasCaro();
        productoMasBarato = supermercadoPrueba.encontrarProductoMasBarato();

        //Validacion
        assertEquals(PRODUCTO_MAS_CARO_ESPERADO, productoMasCaro.getNombre());
        assertEquals(PRODUCTO_MAS_BARATO_ESPERADO, productoMasBarato.getNombre());
    }

}
