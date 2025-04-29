package org.Tarea1;

public abstract class Dulces extends Producto{
    public Dulces( int serie_dulces){
        super(serie_dulces);
    }

    public int getSerie() {
        return super.getSerie();
    }
    public abstract String comer();
}



