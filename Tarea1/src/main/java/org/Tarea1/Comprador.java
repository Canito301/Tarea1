package org.Tarea1;

public class Comprador{
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        vuelto = 0;
        Bebida aux2 = exp.comprarBebida(m, cualBebida);
        Moneda auxM = m;
        if (auxM == null){
            aux2 = null;
        }
        if(aux2 == null){
            sonido = null;
        } else {
            sonido = aux2.beber();
        }

        while(true){
            Moneda aux = exp.getVuelto();
            if(aux==null){
                break;
            } else {
                vuelto += aux.getValor();
            }

        }
    }
    public String queBebiste(){
        return sonido;
    }
    public int cuantoVuelto(){
        return vuelto;
    }
}