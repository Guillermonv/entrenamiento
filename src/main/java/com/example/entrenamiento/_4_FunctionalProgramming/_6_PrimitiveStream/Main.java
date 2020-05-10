package com.example.entrenamiento._4_FunctionalProgramming._6_PrimitiveStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(1);
        integerList.add(2);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(4);
        integerList.add(5);

        IntStream intStream = IntStream.of(1, 2, 4, 5);
        System.out.println(intStream.summaryStatistics().getAverage());


        LongStream longStream = integerList.stream().mapToLong(x -> x);

        OptionalDouble valor = longStream.average();
        valor.getAsDouble();


        DoubleStream doubleStream = DoubleStream.iterate(1, (x) -> x + 1);
        doubleStream.limit(10);

        IntSupplier intSupplier = () -> 1;
        LongConsumer longConsumer = x -> System.out.println(x);

        Predicate<Long> unique = x-> x==1;
        integerList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((k, v) -> {
            if (unique.test(v))
                System.out.println(k);
        });

    }
}
