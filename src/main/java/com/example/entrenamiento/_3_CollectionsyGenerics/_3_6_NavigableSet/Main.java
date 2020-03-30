package com.example.entrenamiento._3_CollectionsyGenerics._3_6_NavigableSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        for (int i = 0; i <=20 ; i++) {
            navigableSet.add(i);
        }
        navigableSet.stream().forEach(x-> System.out.print(x+"-"));
        System.out.println("");
        System.out.println(navigableSet.lower(0)); // MENOR O DEVULVE NULL SI NO ENCUENTRA
        System.out.println(navigableSet.floor(5)); // MENOR O IGUAL ,DEVUELVE NULL SI NO ENCUENTRA
        System.out.println(navigableSet.ceiling(5)); // MAYOR O IGUAL, DEVUELVE NULL SI NO ENCUENTRA
        System.out.println(navigableSet.higher(223123));// MAYOR O NULL SI NO ENCUENTRA
    }


}
