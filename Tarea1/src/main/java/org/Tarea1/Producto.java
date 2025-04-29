package org.Tarea1;

public abstract class Producto {
    private int serie_producto;
    public Producto(int numero_producto){
        this.serie_producto = numero_producto;
    }
    public int getSerie(){
        return serie_producto;
    }

}
