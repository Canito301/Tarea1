package org.Tarea1;

public class DepositoB extends Deposito<Bebida> {
    public void addBebida(Bebida b) {
        super.addElemento(b);
    }

    public Bebida getBebida() {
        return super.getElemento();
    }
}