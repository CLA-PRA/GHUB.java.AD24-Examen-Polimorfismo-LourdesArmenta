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
        double total = 0;
        for (int i = 0; i < indice; i++) {
            total += productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarProductos() {
        for (int i = 0; i < indice; i++) {
            System.out.println(productos[i].getNombre() + ": $" + productos[i].getPrecio());
        }
    }
}
