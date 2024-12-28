package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Ana","Luis","Maria","Pedro","Juan","Juan","Juan","Carla");

        /**
         * operadores finales y no finales
         * finales = ya no se puede hacer nada despues
         * no finales = se pueden seguir haciendo operaciones
         */

        //forEach es un operador final
        names.stream().forEach(System.out::println);

        /**
         * OPERADORES
         * filter(): Filtra los elementos que cumplen con una condición, es un operador no final
         */
        System.out.println("****FILTER*****");
        names.stream().filter((name)->{
            return name.length() > 4;
        }).forEach(System.out::println);

        /**
         * OPERADORES
         * map(): Transforma los elementos aplicando una lambda function, es un operador no final
         */
        System.out.println("****MAP*****");
        names.stream().map((name)->{
            return name.toUpperCase();
        }).forEach(System.out::println);

        //otra forma de hacerlo
        System.out.println("---------------");
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        //concatenando operadores
        System.out.println("****concatenando operadores*******");
        names.stream()
                .map((name)->name.toUpperCase())
                .filter((name)->name.startsWith("A"))
                .forEach(System.out::println);

        /**
         * OPERADORES
         * sorted(): ordena los elementos, es un operador no final
         * sorted() tambien puede recibir una expresion lambda llamada Comparator, permite crear filtros de ordenamiento personalizados
         */
        System.out.println("****SORTED*******");
        names.stream()
                .sorted()
                .forEach(System.out::println);


        /**
         * OPERADORES
         * forEach(): es un operador final
         */
        names.stream().forEach((name)-> {

        });

        /**
         * OPERADORES
         * reduce(): combina todos los elementos en un solo valor, es un operador final
         */
        String resultReduce = names.stream()
                .reduce("Reduce: ",(a,b)->{
                    return a + "" + b;
                });
        System.out.println(resultReduce);

        /**
         * OPERADORES
         * collect(): Recoge los elementos en una collection,
         * puede recibir una expresion lambda llamada Collector
         * en el ejemplo se crea una nueva lista a partir del map()
         */
        System.out.println("*******COLLECT*******");
        List<String> resultCollect = names.stream()
                .map(String::toUpperCase)
                //.toList() se puede usar toList() en java 17 en adelante en lugar de collect(Collectors.toList())
                .collect(Collectors.toList());

        resultCollect.forEach(System.out::println);

        /**
         * OPERADORES
         * distinct(): Elimina los elementos duplicados, no es un operador final
         */
        System.out.println("*******DISTINCT*******");
        names.stream()
                .distinct()
                .forEach(System.out::println);

        /**
         * OPERADORES
         * limit(): limita el numoero de elementos procesados, no es un operador final
         */
        System.out.println("*******LIMIT*******");
        names.stream()
                .limit(3)
                .forEach(System.out::println);

        /**
         * OPERADORES
         * skip(): omite un numero especifico de elementos, no es un operador final
         */
        System.out.println("*******SKIP*******");
        names.stream()
                .skip(3)
                .forEach(System.out::println);

        /**
         * OPERADORES
         * anyMatch(): verifica si algun elemento cumple una condicion, es un operador final
         */
        System.out.println("*******ANYMATCH*******");
        boolean resultAnyMatch = names.stream()
                .anyMatch((name)->{
                    return name.startsWith("J");
                });

        System.out.println(resultAnyMatch);

        /**
         * OPERADORES
         * allMatch(): verifica si todos los elemento cumplen una condicion, es un operador final
         */
        System.out.println("*******AllMATCH*******");
        boolean resultAllMatch = names.stream()
                .allMatch((name)->{
                    return name.startsWith("A");
                });

        System.out.println(resultAllMatch);

        /**
         * OPERADORES
         * noneMatch(): verifica si ningun elemento cumplen una condicion, es un operador final
         */
        System.out.println("*******AllMATCH*******");
        boolean resultNoneMatch = names.stream()
                .noneMatch((name)->{
                    return name.length() == 10;
                });

        System.out.println(resultNoneMatch);
    }
}
