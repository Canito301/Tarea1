package org.Tarea1;

public class NoHayProductoException extends Exception{
    public NoHayProductoException(){
        super();
        System.out.println("No hay producto");
    }
}
