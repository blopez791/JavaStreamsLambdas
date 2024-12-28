package org.example.lambdas.runnable;

public class RunnableExample {
    public static void main(String[] args) {
        /**
         * No recibe valores y no retorna nada, solo ejecuta una tarea
         */
        Runnable runnable = () -> {
            System.out.println("Ejecutando tarea...");
        };

        runnable.run();
    }
}
