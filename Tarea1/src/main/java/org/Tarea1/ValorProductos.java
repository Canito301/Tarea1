package org.Tarea1;

public enum ValorProductos {
    FANTA(800),
    COCACOLA(800),
    SPRITE(800)
    private final int precio;

    ValorProductos(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

}
