package org.Tarea1;

public abstract class Dulce extends Producto{
    public Dulce( int serie_dulce){
        super(serie_dulce);
    }

    public int getSerie() {
        return super.getSerie();
    }
    public abstract String comer();
}



