package org.Tarea1;

public class Comprador{
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m, int cual, Expendedor exp) throws PagoInsuficienteException, NoHayProductoException, PagoIncorrectoException {
        vuelto = 0;
        Producto aux2 = null;
        do {
            exp.getVuelto();
        } while (exp.getVuelto() != null);
        aux2 = exp.comprarProducto(m, cual);

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
                if(aux2 == null){
                    vuelto = aux.getValor();
                    break;
                }
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