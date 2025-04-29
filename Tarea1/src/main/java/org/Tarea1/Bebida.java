package org.Tarea1;

public abstract class Bebida extends Producto{

    public Bebida(int serie){
        super(serie);
    }

    public int getSerie() {
        return super.getSerie();
    }
    public abstract String beber();
}

