package org.example.lambdas.consumer;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        /**
         * Consumer
         * Recibe un valor y no retorna nada
         */
        Consumer<String> consumer = (param)->{
            System.out.println(param);
        };


        /**
         * esta es otra forma de hacerlo
         */
        Consumer<String> consumer2 = System.out::println;

        consumer.accept("Pepito");
    }
}