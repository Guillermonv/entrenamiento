package com.example.entrenamiento._4_FunctionalProgramming._4_StreamsIntermiadteOperations;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Auto {
    int id;
    String modelo;
    String color = "blanco";
    Double motor;

    public Auto(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", motor=" + motor +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Stream<Auto> autos = Stream.iterate(new Auto(1), (x) -> new Auto(x.id + 1));
        List<Auto> autoList = autos.skip(10).limit(10).peek(x -> System.out.println("ELMENTOS ANTES DEL FILTRADO" + x.toString())).filter(x -> x.id % 2 == 0).map(x -> {
            x.motor = 2.0;
            return x;
        }).filter(x -> x.id >= 15).map(x -> {
            x.color = "rojo";
            return x;
        }).sorted(new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                return o2.id - o1.id;
            }
        }).collect(Collectors.toList());
        autoList.forEach(x -> System.out.println(x.toString()));


        Stream<List<Integer>> integerListStream = Stream.of(
                Arrays.asList(1, 2),
                Arrays.asList(3, 5, 4, 5),
                Arrays.asList(5, 5)
        ).distinct();

        Stream<Integer> integerStream = integerListStream.flatMap(Collection::stream);
        integerStream.distinct().forEach(x-> System.out.println(x));

    }
}
