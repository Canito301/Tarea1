package org.Tarea1;

public class Expendedor{
    private DepositoB coca;
    private DepositoD snickers;
    private DepositoD super8;
    private DepositoB fanta;
    private DepositoB sprite;
    private DepositoM monVu;
    private int precio;
    public Expendedor(int numProductos){

        this.coca = new DepositoB();
        this.sprite = new DepositoB();
        this.fanta = new DepositoB();

        this.monVu = new DepositoM();

        this.super8 = new DepositoD();
        this.snickers = new DepositoD();

        for (int i = 100; i < numProductos+100; i++) {
            Bebida b = new CocaCola(i);
            coca.addBebida(b);
            Bebida a = new Sprite(i+100);
            sprite.addBebida(a);
            Bebida c = new Fanta(i+200);
            fanta.addBebida(c);
            Dulce d = new Snickers(i+300);
            snickers.addDulce(d);
            Dulce e = new Super8(i+400);
            super8.addDulce(e);

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
    public Producto comprarProducto(Moneda m, int tipo) throws PagoInsuficienteException, NoHayProductoException, PagoIncorrectoException {
        Producto producto = null;
        int precioProducto = 0;
        if (m == null) {
            throw new PagoIncorrectoException();
        }
        if (m.getValor() < precioProducto) {
            monVu.addMoneda(m);
            throw new NoHayProductoException();
        }
        switch (tipo) {
            case 1:
                producto = coca.getBebida();
                precio = ValorProductos.COCACOLA_PRECIO.getPrecio();
                break;
            case 2:
                producto = sprite.getBebida();
                precio = ValorProductos.SPRITE_PRECIO.getPrecio();
                break;
            case 3:
                producto = fanta.getBebida();
                precio = ValorProductos.FANTA_PRECIO.getPrecio();
                break;
            case 4:
                producto = snickers.getDulce();
                precio = ValorProductos.SNIKERS_PRECIO.getPrecio();
                break;
            case 5:
                producto = super8.getDulce();
                precio = ValorProductos.SUPER8_PRECIO.getPrecio();
                break;
            default:
                monVu.addMoneda(m);
                throw new NoHayProductoException();

        }
        if (producto == null) {
            monVu.addMoneda(m);
            throw new NoHayProductoException();
        }
        if (m.getValor() > precioProducto) {
            actualizar(m);
        }
        return producto;
    }
    public Moneda getVuelto(){
        return monVu.getMoneda();
    }
}