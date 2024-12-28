package org.example.lambdas.suplier;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args){
        /**
         * No recibe ningun parametro pero retorna un resultado
         */
        Supplier<String> supplier = () -> {
            return "Hola, soy un supplier";
        };

        String result = supplier.get();
        System.out.println(result);
    }
}
