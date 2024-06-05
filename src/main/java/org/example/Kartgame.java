package org.example;

import java.util.Stack;

public class Kartgame {
    private Stack<Karta> koloda;
    private Stack<Karta> sbros;

    public Stack<Karta> getKoloda() {
        return koloda;
    }

    public void setKoloda(Stack<Karta> koloda) {
        this.koloda = koloda;
    }

    public Stack<Karta> getSbros() {
        return sbros;
    }

    public void setSbros(Stack<Karta> sbros) {
        this.sbros = sbros;
    }

    public Karta takekart(){
        return koloda.pop();
    }
    public void sbros(Karta karta){
        System.out.println( sbros.push(karta));

    }
    public Karta showtopkart(){
return koloda.peek();
    }


}
