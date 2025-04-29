package org.Tarea1;

public class DepositoD extends Deposito<Dulce> {
    public void addDulce(Dulce d) {
        super.addElemento(d);
    }

    public Dulce getDulce() {
        return super.getElemento();
    }
}
