package org.Tarea1;
import java.util.ArrayList;
public class Deposito<T> {
    private ArrayList<T> lista;

    public Deposito() {
        this.lista = new ArrayList<>();
    }

    public void addProducto(T producto) {
        lista.add(producto);
    }

    public T getProducto() {
        if (lista.isEmpty()) {
            return null;
        } else {
            return lista.remove(0);
        }
    }
}
