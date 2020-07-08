package com.example.entrenamiento._7_Concurrency._6_ConcurrentCollections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

class Main extends Thread {
static ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<>();

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            map.put(103,"D");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();

        map.put(100,"A");
        map.put(101,"B");
        map.put(102,"C");
        main.start();
        for (Object o : map.entrySet()){
            Thread.sleep(2000);
            System.out.println(o);
        }
        System.out.println(map);

        CopyOnWriteArrayList<String> celulares = new CopyOnWriteArrayList<>(Arrays.asList("Iphone 5", "Iphone 6", "Motorla G4", "Samsung Galaxy"));
        for (String valor : celulares){
            if(valor.startsWith("Iphone"))
                celulares.remove(valor);
        }
        for (String valor2 : celulares){
            System.out.println(valor2);
        }

    }
}