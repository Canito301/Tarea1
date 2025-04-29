package org.Tarea1;

public class Main {
    public static void main (String[] args){
        Expendedor exp = new Expendedor(6,200);
        Moneda m = null;
        Comprador c=null;
        m = new Moneda1500();
        c = new Comprador(m,1,exp);
        System.out.println(c.queBebiste()+", " +c.cuantoVuelto());
        System.out.println("Cambio Francisco");

    }


}
