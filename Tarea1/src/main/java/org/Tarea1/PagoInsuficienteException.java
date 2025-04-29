package org.Tarea1;

public class PagoInsuficienteException extends Exception{
    PagoInsuficienteException(){
        super();
        System.out.println("Pago insuficiente");
    }
}
