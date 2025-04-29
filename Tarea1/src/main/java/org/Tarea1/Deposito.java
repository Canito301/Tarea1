package org.Tarea1;
import java.util.ArrayList;
public class Deposito<T> {
    private ArrayList<T> lista;

    public Deposito() {
        this.lista = new ArrayList<>();
    }

    public void addElemento(T elemento) {
        lista.add(elemento);
    }

    public T getElemento() {
        if (lista.isEmpty()) {
            return null;
        } else {
            return lista.remove(0);
        }
    }
}
