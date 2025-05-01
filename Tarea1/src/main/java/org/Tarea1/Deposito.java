package org.Tarea1;
import java.util.ArrayList;
public class Deposito<T> {
    protected ArrayList<T> lista;

    public Deposito() {
        this.lista = new ArrayList<>();
    }
    public void vaciar() {
        lista.clear();
    }


    public void addElemento(T elemento) {
        lista.add(elemento);
    }
    public void limpiarVuelto() {
        int i = 0;
        while(i < 200){
            this.getElemento();
            i++;
        }
    }
    public T getElemento() {
        if (lista.isEmpty()) {
            return null;
        } else {
            return lista.remove(0);
        }
    }
}
