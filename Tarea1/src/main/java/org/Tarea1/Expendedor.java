package org.Tarea1;

public class Expendedor{
    private Deposito<Bebida> coca;
    private Deposito<Dulce> snickers;
    private Deposito<Dulce> super8;
    private Deposito<Bebida> fanta;
    private Deposito<Bebida> sprite;
    private Deposito<Moneda> monVu;
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
            coca.addProducto(b);
            Bebida a = new Sprite(i+100);
            sprite.addProducto(a);
            Bebida c = new Fanta(i+200);
            fanta.addProducto(c);
            Dulce d = new Snickers(i+300);
            snickers.addProducto(d);
            Dulce e = new Super8(i+400);
            super8.addProducto(e);

        }
    }
    public void actualizar(Moneda m){
        int valor = m.getValor() - precio;
        int suma = 0;
        while (suma < valor){
            Moneda monedan = new Moneda100();
            monVu.addProducto(monedan);
            suma += 100;
        }
    }


    public Producto comprarProducto(Moneda m, int tipo) throws PagoInsuficienteException, NoHayProductoException, PagoIncorrectoException {
        Producto producto = null;
        Productos elemento = Productos.obtenerProducto(tipo);

        if (m == null) {
            throw new PagoIncorrectoException();
        }
        if (m.getValor() < elemento.getPrecio()) {
            monVu.addProducto(m);
            throw new PagoInsuficienteException();
        }
        switch (elemento) {
            case COCACOLA:
                producto = coca.getProducto();
                precio = Productos.COCACOLA.getPrecio();
                break;
            case SPRITE:
                producto = sprite.getProducto();
                precio = Productos.SPRITE.getPrecio();
                break;
            case FANTA:
                precio = Productos.FANTA.getPrecio();
                producto = fanta.getProducto();
                break;
            case SNICKERS:
                producto = snickers.getProducto();
                precio = Productos.SNICKERS.getPrecio();
                break;
            case SUPER8:
                producto = super8.getProducto();
                precio = Productos.SUPER8.getPrecio();
                break;
            default:
                monVu.addProducto(m);
                throw new NoHayProductoException();

        }
        if (producto == null) {
            monVu.addProducto(m);
            throw new NoHayProductoException();
        }
        if (m.getValor() >= precio) {
            actualizar(m);
        }
        return producto;
    }
    public Moneda getVuelto(){
        return monVu.getProducto();
    }
}