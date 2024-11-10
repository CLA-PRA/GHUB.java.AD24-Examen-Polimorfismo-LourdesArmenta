package clases;

// Clase Carrito
public class Carrito<T extends Producto> {
    private T[] productos;
    private int indice;

    @SuppressWarnings("unchecked")
    public Carrito(int capacidad) {
        productos = (T[]) new Producto[capacidad];
        indice = 0;
    }

    public void agregarProducto(T producto) {
        if (indice < productos.length) {
            productos[indice++] = producto;
        } else {
            System.out.println("Carrito lleno, no se puede agregar más productos.");
        }
    }

    public double calcularTotal() {
        
    }

    public void mostrarProductos() {
        
    }
}
