package org.Tarea1;

import java.io.StringReader;

public abstract class Moneda implements Comparable<Moneda>{
    public Moneda(){}
    public Moneda getSerie(){
        return this;
    }
    public int compareTo(Moneda otraMoneda) {
        return Integer.compare(this.getValor(), otraMoneda.getValor());
    }

    @Override
    public String toString() {
        return "Número de Serie=" + this.hashCode() + " " + getValor() + "pesos chilenos";
    }

    public abstract int getValor();
}



