package org.Tarea1;

public class PagoIncorrectoException extends Exception{
    public PagoIncorrectoException(){
        super("Pago incorrecto (no se ingresó moneda)");
    }
}
