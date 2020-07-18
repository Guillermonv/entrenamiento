package com.example.entrenamiento._7_Concurrency._7_ParallelStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Procesador {
    int procesarDatos(int i){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return i + 1;
    }
    Long procesarLista(List<Integer> integers){
        return integers.parallelStream().map(x->procesarDatos(x)).count();
    }
}

class Main  {
    public static void main(String[] args)  {
      //  System.out.println(Runtime.getRuntime().availableProcessors());
        List<String> animales = Arrays.asList("cocodrilo","perro","mono","zebra","leon");
   //     animales.stream().parallel().forEachOrdered(System.out::println);

  /*   animales.parallelStream().map(x->{
         System.out.println(x);
    return x.toUpperCase(); }).forEach(x-> System.out.println(x)); */

     Procesador procesador = new Procesador();
     List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 100 ; i++) {
            integerList.add(i);
        }
     long start = System.currentTimeMillis();

     procesador.procesarLista(integerList);
     long end = (System.currentTimeMillis()-start)/1000;
        System.out.println("Duracion en segundos " + end);
    }
}