package org.example.lambdas.binary;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        /**
         * Recibe dos valores del mismo tipo y retorna un valor del mismo tipo
         */
        BinaryOperator<Integer> binaryOperator = (a,b)->{
            return a+b;
        };

        /**
         * otra forma de hacerlo para sumar dos numeros
         */
        BinaryOperator<Integer> binaryOperator2 = Integer::sum;

        int result = binaryOperator.apply(10,50);
        System.out.println(result);
    }
}
