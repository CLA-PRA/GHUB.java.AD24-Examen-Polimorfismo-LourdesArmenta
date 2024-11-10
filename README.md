# Proyecto - Java con Pruebas para Autograding

1. Crea una clase abstracta Producto con métodos abstractos getNombre y getPrecio.

2. Implementa dos clases que extiendan esta clase abstracta: ProductoElectronico y ProductoAlimenticio.

3. Crea una clase Carrito que pueda contener productos de 4. cualquier tipo que extienda Producto.

5. En la clase Principal, crea instancias de Carrito y añade productos, luego muestra el total del carrito.

## Diagrama de clases
[Editor en línea](https://mermaid.live/)
```mermaid
---
title: Clase
---
classDiagram
    class Producto {
        <<abstract>>
        -String nombre
        -double precio
        +Producto(String nombre, double precio)
        +String getNombre()
        +double getPrecio()
    }

    class ProductoElectronico {
        +ProductoElectronico(String nombre, double precio)
    }

    class ProductoAlimenticio {
        +ProductoAlimenticio(String nombre, double precio)
    }

    class Carrito {
        -Producto[] productos
        -int indice
        +Carrito(int capacidad)
        +void agregarProducto(T producto)
        +double calcularTotal()
        +void mostrarProductos()
    }

    class Principal {
        +main(String[] args)
    }

    Producto <|-- ProductoElectronico
    Producto <|-- ProductoAlimenticio
    Carrito --> Producto
    Principal --> Carrito
    Principal --> ProductoElectronico
    Principal --> ProductoAlimenticio
```
[Referencia-Mermaid](https://mermaid.js.org/syntax/classDiagram.html)

## Diagrama de clases UML con draw.io
El repositorio está configurado para crear Diagramas de clases UML con ```draw.io```. Para usarlo simplemente agrega un archivo con extensión ```.drawio.png```, das doble clic sobre el mismo y se activará el editor ```draw.io``` incrustado en ```VSCode``` para edición. Asegúrate de agregar las formas UML en el menú de formas del lado izquierdo (opción ```+Más formas```).

## Uso del proyecto con make

### Default - Compilar+Probar+Ejecutar
```
make
```
### Compilar
```
make compile
```
### Probar todo
```
make test
```
### Ejecutar App
```
make run
```
### Limpiar binarios
```
make clean
```
## Comandos Git-Cambios y envío a Autograding

### Por cada cambio importante que haga, actualice su historia usando los comandos:
```
git add .
git commit -m "Descripción del cambio"
```
### Envíe sus actualizaciones a GitHub para Autograding con el comando:
```
git push origin main
```
## Comandos individuales
### Compilar

```
find ./ -type f -name "*.java" > compfiles.txt
javac -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```
Ejecutar ambos comandos en 1 sólo paso:

```
find ./ -type f -name "*.java" > compfiles.txt ; javac -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```


### Ejecutar Todas la pruebas locales de 1 Test Case

```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-class miTest.AppTest
```
### Ejecutar 1 prueba local de 1 Test Case

```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-method miTest.AppTest#appHasAGreeting
```
### Ejecutar App
```
java -cp build miPrincipal.Principal
```
Los comandos anteriores están considerados para un ambiente Linux. [Referencia.](https://www.baeldung.com/junit-run-from-command-line)
