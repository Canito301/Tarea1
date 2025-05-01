package org.Tarea1;
/**
 * Clase abstracta que representa un dulce como tipo de producto.
 * Sirve como base para dulces específicos que deben implementar el metodo {@code comer()}.
 */
public abstract class Dulce extends Producto{
    /**
     * Constructor que inicializa el dulce con un número de serie.
     * @param serie_dulce número de serie del dulce.
     */
    public Dulce( int serie_dulce){
        super(serie_dulce);
    }
    /**
     * Retorna el número de serie del dulce.
     * @return el número de serie.
     */
    public int getSerie() {
        return super.getSerie();
    }
    /**
     * Metodo abstracto que representa la acción de comer el dulce.
     * @return una cadena que describe el dulce al ser comido.
     */
    public abstract String comer();
}



