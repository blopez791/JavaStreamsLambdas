package org.example.lambdas.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args){
        /**
         * Recibe dos parametros y no devuelve nada
         */
        BiConsumer<String,String> biConsumer = (a,b)->{
            System.out.println(a + " " + b);
        };

        biConsumer.accept("hola","mundo");
    }
}
