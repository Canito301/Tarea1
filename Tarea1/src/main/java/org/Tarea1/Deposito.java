package org.Tarea1;
import java.util.ArrayList;

public class Deposito{
    private ArrayList<Bebida> lista;
    public Deposito(){
        this.lista = new ArrayList<Bebida>();
    }
    public void addBebida(Bebida b){
        lista.add(b);
    }
    public Bebida getBebida(){
        if(!(lista.size()>0)){
            return null;
        } else {
            return lista.remove(0);
        }
    }
}