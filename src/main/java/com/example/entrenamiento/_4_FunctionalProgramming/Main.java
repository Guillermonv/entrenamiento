package com.example.entrenamiento._4_FunctionalProgramming;

import java.time.LocalDateTime;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Supplier<LocalDateTime> localDateTimeSupplier = ()-> LocalDateTime.now();
        System.out.println(localDateTimeSupplier.get());
        Consumer<String> stringConsumer = x->System.out.println("Procesando el valor : " + x + " -" +localDateTimeSupplier.get());
        stringConsumer.accept("COMPUTADORA");
        BiConsumer<String,String> biConsumer = (x,y)-> System.out.println(x.concat(y.toUpperCase()));
        Predicate<Integer> integerPredicate = x-> x>=10;
        if (integerPredicate.negate().test(9))
            biConsumer.accept("Hello","World");

        BiPredicate<String,Integer> biPredicate = (x,y) ->x.startsWith("a") && y>=10;
        System.out.println(biPredicate.test("anana",1));
    }

}
