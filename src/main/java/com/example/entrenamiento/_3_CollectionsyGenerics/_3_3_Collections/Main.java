package com.example.entrenamiento._3_CollectionsyGenerics._3_3_Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> nombresList = new ArrayList<>();
        System.out.println("LIST");
        nombresList.add("PEPE");
        nombresList.add("MARIA");
        nombresList.add("PEPE");
        nombresList.stream().forEach(x-> System.out.println(x.toString()));
        System.out.println("SET");
        Set<String> nombresSet = new HashSet<>();
        nombresSet.add("PEPE");
        nombresSet.add("MARIA");
        nombresSet.add("PEPE");
        nombresSet.stream().forEach(x-> System.out.println(x.toString()));
        System.out.println("METODOS");
        System.out.println(nombresList.get(0)); // DEVUELVE EL OBJETO EN EL INDICE
        System.out.println(nombresSet.contains("PEPE")); //DEVUELVE SI EL OBJECTO SI EXISTE
        System.out.println(nombresList.add("JUAN"));//BOLEEAN AGREGAR O NO
        System.out.println(nombresSet.add("MARIA")); //BOLEEAN AGREGAR O NO
        System.out.println(nombresList.remove("PEPE"));//BOLEEAN REMUEVE O NO
        System.out.println(nombresSet.remove("PEPE"));//BOLEEAN REMUEVE O NO
        nombresList.clear();
        nombresSet.clear();

        List<String> asd = new ArrayList<>(10);
        System.out.println(asd.size());


    }
}
