package org.Tarea1;

public class Main {
    public static void main (String[] args){
        Expendedor exp = new Expendedor(6);
        Moneda m = null;
        Comprador c=null;
        m = new Moneda1000();
        c = new Comprador(m,2,exp);
        System.out.println(c.queBebiste()+", " +c.cuantoVuelto());

    }


}
