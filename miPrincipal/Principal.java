package miPrincipal;
import clases.*;

public class Principal {
    
    public static void main(String[] args) {
           
       
            Carrito<Producto> carrito = new Carrito<>(10);
    
            ProductoElectronico laptop = new ProductoElectronico("Laptop", 1200.00);
            ProductoAlimenticio manzana = new ProductoAlimenticio("Manzana", 0.50);
    
            carrito.agregarProducto(laptop);
            carrito.agregarProducto(manzana);
    
            carrito.mostrarProductos();
            System.out.println("Total: $" + carrito.calcularTotal());
       
    }
}