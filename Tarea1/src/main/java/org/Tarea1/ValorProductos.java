package org.Tarea1;

public enum ValorProductos {
    FANTA_PRECIO(800),
    COCACOLA_PRECIO(900),
    SPRITE_PRECIO(700),
    SNIKERS_PRECIO(1000),
    SUPER8_PRECIO(600);
    private final int precio;

    ValorProductos(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

}
