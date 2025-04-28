package org.Tarea1;
import java.util.ArrayList;

public class DepositoM{
    private ArrayList<Moneda> lista;
    public DepositoM(){
        this.lista = new ArrayList<Moneda>();
    }
    public void addMoneda(Moneda m){
        lista.add(m);
    }
    public Moneda getMoneda(){
        if(!(lista.size()>0)){
            return null;
        } else {
            return lista.remove(0);
        }
    }
}
