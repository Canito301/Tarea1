package org.Tarea1;

public class Expendedor{
    public static final int COCA = 1;
    public static final int COCA = 1;
    public static final int COCA = 1;
    public static final int COCA = 1;
    public static final int COCA = 1;
    private Deposito coca;
    private Deposito snickers;
    private Deposito super8;
    private Deposito fanta;
    private Deposito sprite;
    private Deposito monVu;
    private int precio;
    public Expendedor(int numBebidas, int precioBebidas){

        this.coca = new DepositoB();
        this.sprite = new DepositoB();
        this.fanta = new DepositoB();

        this.monVu = new DepositoM();

        this.super8 = new DepositoD();
        this.snickers = new DepositoD();

        this.precio = precioBebidas;
        for (int i = 100; i < numBebidas+100; i++) {
            Bebida b = new CocaCola(i);
            coca.addBebida(b);
            Bebida a = new Sprite(i+100);
            sprite.addBebida(a);
            Bebida c = new Fanta(i+200);
            fanta.addBebida(c);



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
    public Bebida comprarBebida(Moneda m, int tipo) {
        Bebida bebida = null;
        if (m == null) {
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
        } else if (tipo == ){

        } else{
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