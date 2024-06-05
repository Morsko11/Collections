package org.example;

import java.util.Stack;

public class Metod {
    public<A extends  Number> A met(Stack<A> stack){
        Integer min = Integer.MAX_VALUE;
        for (A m: stack) {
            if (m.intValue() < min){
                min = m.intValue();
        }

        }

        return (A) min;
    }
}
