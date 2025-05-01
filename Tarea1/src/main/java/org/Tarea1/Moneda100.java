package org.Tarea1;
/**
 * Representa una moneda chilena de 100 pesos.
 * <p>
 * Esta clase extiende a {@link Moneda} y define el valor específico
 * de la moneda como 100 pesos mediante la implementación del método {@link #getValor()}.
 * </p>
 */
public class Moneda100 extends Moneda{

    /**
     * Constructor que llama al constructor de {@link Moneda}.
     */
    public Moneda100(){
        super();
    }
    /**
     * Retorna el valor de esta moneda.
     *
     * @return el valor 100, que corresponde a 100 pesos chilenos.
     */
    @Override
    public int getValor(){
        return 100;
    }
}