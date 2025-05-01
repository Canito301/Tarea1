package org.Tarea1;

public class Main {
    public static void main(String[] args) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Expendedor exp = new Expendedor(1);  // Solo un producto de cada tipo
        Comprador c = null;
        Moneda m;

        // Moneda incorrecta (null)
        try {
            c = new Comprador(null, 1, exp);  // CocaCola
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Pago exacto
        try {
            m = new Moneda1000();  // Precio de CocaCola = 900
            c = new Comprador(m, 4, exp);
            System.out.println(c.queBebiste() + ", Vuelto: " + c.cuantoVuelto());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // Pago mayor al precio
        try {
            m = new Moneda1000();  // Precio de Sprite = 700
            c = new Comprador(m, 2, exp);
            System.out.println(c.queBebiste() + ", Vuelto: " + c.cuantoVuelto());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Pago insuficiente
        try {
            m = new Moneda500();  // Precio de Fanta = 800
            c = new Comprador(m, 3, exp);
            System.out.println(c.queBebiste() + ", Vuelto: " + exp.getVuelto().getValor());
        } catch (Exception e) {

            System.out.println(e.getMessage() + ", Vuelto: " + exp.getVuelto().getValor());
        }
        // Producto agotado
        try {
            m = new Moneda1000();
            c = new Comprador(m, 4, exp); //ya se compró
            System.out.println(c.queBebiste() + ", Vuelto: " + exp.getVuelto().getValor());
        } catch (Exception e) {
            System.out.println(e.getMessage() + ", Vuelto: " + exp.getVuelto().getValor());
        }
    }
}

