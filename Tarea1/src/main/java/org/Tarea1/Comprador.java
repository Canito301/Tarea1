package org.Tarea1;

public class Comprador{
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m, int cual, Expendedor exp){
        vuelto = 0;
        Producto aux2 = null;
        try {
            aux2 = exp.comprarProducto(m, cual);
        } catch (PagoInsuficienteException e) {
            throw new RuntimeException(e);
        } catch (NoHayProductoException e) {
            throw new RuntimeException(e);
        } catch (PagoIncorrectoException e) {
            throw new RuntimeException(e);
        }
        Moneda auxM = m;
        if (auxM == null){
            aux2 = null;
        }
        if(aux2 == null){
            sonido = null;
        } else {
            if (aux2 instanceof Bebida) {
                sonido = ((Bebida) aux2).beber();
            } else if (aux2 instanceof Dulce) {
                sonido = ((Dulce) aux2).comer();
            }
        }

        while(true){
            Moneda aux = exp.getVuelto();
            if(aux==null){
                break;
            } else {
                vuelto += aux.getValor();
            }

        }
    }
    public String queBebiste(){
        return sonido;
    }
    public int cuantoVuelto(){
        return vuelto;
    }
}