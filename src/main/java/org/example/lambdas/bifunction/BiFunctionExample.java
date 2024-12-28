package org.example.lambdas.bifunction;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args){
        /**
         * Recibe dos valores y retorna un resultado
         */
        BiFunction<Integer,Integer,Integer> biFunction = (a,b) -> {
            return a+b;
        };

        /**
         * otra forma de hacerlo para sumar dos numeros
         */
        BiFunction<Integer,Integer,Integer> biFunction2 = Integer::sum;

        int result = biFunction.apply(10,20);
        System.out.println(result);

        int result2 = biFunction2.apply(20,20);
        System.out.println(result2);
    }
}
