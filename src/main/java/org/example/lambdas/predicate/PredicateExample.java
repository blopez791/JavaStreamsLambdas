package org.example.lambdas.predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args){
        /**
         * Recibe un valor y devuelve un boolean (true or false)
         */
        Predicate<String> predicate = (str) -> {
            return str.length() > 5;
        };

        boolean result = predicate.test("hola mundo");
        System.out.println(result);
    }
}
