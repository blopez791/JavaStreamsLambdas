package org.example.lambdas.function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args){
        /**
         * Recibe un valor y retorna un resultado
         */
        Function<Integer,String> function = (num)->{
            return "El numero es: "+num;
        };

        String result = function.apply(5);
        System.out.println(result);
    }
}
