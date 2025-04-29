package org.Tarea1;

public class PagoIncorrectoException extends Exception{
    public PagoIncorrectoException(){
        super();
        System.out.println("Pago incorrecto");
    }
}
