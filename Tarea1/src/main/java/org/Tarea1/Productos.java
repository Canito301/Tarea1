package org.Tarea1;

public enum Productos {
    COCACOLA(1, 900),
    SPRITE(2, 700),
    FANTA(3, 800),
    SNICKERS(4, 1000),
    SUPER8(5, 600);

    private int valor;
    private int precio;

    Productos(int i, int precio) {
        this.valor = i;
        this.precio = precio;
    }

    public int getValor() {
        return this.valor;
    }

    public int getPrecio() {

        return precio;
    }

    public static Productos obtenerProducto(int valorBuscado) {
        for (Productos producto : Productos.values()) {
            if (producto.valor == valorBuscado) {
                return producto;
            }
        }
        return null;
    }

}