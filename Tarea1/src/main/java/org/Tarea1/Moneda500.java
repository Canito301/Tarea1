package org.Tarea1;
/**
 * Representa una moneda chilena de 500 pesos.
 * <p>
 * Esta clase extiende a {@link Moneda} y define el valor específico
 * de la moneda como 500 pesos mediante la implementación del método {@link #getValor()}.
 * </p>
 */
public class Moneda500 extends Moneda{

    /**
     * Constructor que llama al constructor de {@link Moneda}.
     */
    public Moneda500(){
        super();
    }
    /**
     * Retorna el valor de esta moneda.
     *
     * @return el valor 500, que corresponde a 500 pesos chilenos.
     */
    @Override
    public int getValor(){
        return 500;
    }
}