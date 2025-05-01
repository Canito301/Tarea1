package org.Tarea1;

public class NoHayProductoException extends Exception{
    public NoHayProductoException(){
        super("No hay producto");
    }
}
