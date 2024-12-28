package org.example.lambdas.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args){
        /**
         * Recibe dos valores y devuelve un boolean
         */
        BiPredicate<Integer,Integer> biPredicate = (a,b) -> {
            return a > b;
        };

        boolean result = biPredicate.test(10,5);
        System.out.println(result);
    }
}
