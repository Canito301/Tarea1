package org.Tarea1;

public class Expendedor{
    private DepositoP coca;
    private DepositoP oreo;
    private DepositoP fanta;
    private DepositoP sprite;
    private DepositoM monVu;
    private int precio;
    public Expendedor(int numBebidas, int precioBebidas){
        this.coca = new DepositoB();
        this.sprite = new DepositoB();
        this.monVu = new DepositoM();
        this.precio = precioBebidas;
        for (int i = 100; i < numBebidas+100; i++) {
            Bebida b = new CocaCola(i);
            coca.addBebida(b);
            Bebida a = new Sprite(i+100);
            sprite.addBebida(a);
        }
    }
    public void actualizar(Moneda m){
        int valor = m.getValor() - precio;
        int suma = 0;
        while (suma < valor){
            Moneda monedan = new Moneda100();
            monVu.addMoneda(monedan);
            suma += 100;
        }
    }
    public Bebida comprarBebida(Moneda m, int tipo){
        Bebida bebida = null;
        if (m == null){
            return null;
        }
        if (m.getValor() < precio) {
            monVu.addMoneda(m);
            return null;
        }

        if (tipo == COCA) {
            bebida = coca.getBebida();
        } else if (tipo == SPRITE) {
            bebida = sprite.getBebida();
        } else {
            monVu.addMoneda(m);
            return null;
        }
        if (bebida == null) {
            monVu.addMoneda(m);
            return null;
        }
        if (m.getValor() > precio) {
            actualizar(m);
        }
        return bebida;
    }
    public Moneda getVuelto(){
        return monVu.getMoneda();
    }
}