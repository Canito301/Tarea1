package org.Tarea1;

public class DepositoM extends Deposito<Moneda> {
    public void addMoneda(Moneda m) {
        super.addElemento(m);
    }

    public Moneda getMoneda() {
        return super.getElemento();
    }
}
