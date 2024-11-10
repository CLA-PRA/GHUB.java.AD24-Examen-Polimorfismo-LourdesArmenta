package miTest;

import miPrincipal.*;
import clases.*;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testProductoElectronico() {
        ProductoElectronico laptop = new ProductoElectronico("Laptop", 1200.00);
        assertEquals("Laptop", laptop.getNombre());
        assertEquals(1200.00, laptop.getPrecio());
    }

    @Test
    void testProductoAlimenticio() {
        ProductoAlimenticio manzana = new ProductoAlimenticio("Manzana", 0.50);
        assertEquals("Manzana", manzana.getNombre());
        assertEquals(0.50, manzana.getPrecio());
    }

    @Test
    void testCarrito() {
        Carrito<Producto> carrito = new Carrito<>(10);
        ProductoElectronico laptop = new ProductoElectronico("Laptop", 1200.00);
        ProductoAlimenticio manzana = new ProductoAlimenticio("Manzana", 0.50);

        carrito.agregarProducto(laptop);
        carrito.agregarProducto(manzana);

        assertEquals(1200.50, carrito.calcularTotal());
    }

    
}