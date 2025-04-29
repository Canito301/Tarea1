package org.Tarea1;
import java.util.ArrayList;

public class DepositoD{
    private ArrayList<Dulce> lista;
    public DepositoD(){
        this.lista = new ArrayList<Dulce>();
    }
    public void addDulce(Dulce b){
        lista.add(d);
    }
    public Dulce getDulce(){
        if(!(lista.size()>0)){
            return null;
        } else {
            return lista.remove(0);
        }
    }
}
