package com.example.entrenamiento._3_CollectionsyGenerics._3_8_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> lacteos = new HashMap<>();
        lacteos.put(1,"Leche");
        lacteos.put(2,"Manteca");
        lacteos.put(2,"Queso");
        lacteos.putIfAbsent(2,"Yogurt");
        lacteos.putIfAbsent(3,"Yogurt");


        Map<Integer,String> bebidas = new HashMap<>();
        bebidas.put(4,"Jugo");
        bebidas.put(5,"Gaseosa");
        bebidas.put(6,"Cerveza");

        Map<Integer,String> productos = new HashMap<>();
        productos.putAll(bebidas);
        productos.putAll(lacteos);

        System.out.println(productos.getOrDefault(1,"No hay hay producto con esa clave"));
        System.out.println(productos.getOrDefault(10,"No hay hay producto con esa clave"));
        System.out.println("remove valor con clave 1 " + productos.remove(1));
        System.out.println(productos.containsValue("Carne"));
        System.out.println(productos.containsKey(2));

        BiFunction<String,String,String> biFunction = (x,y)->x + " " + y;
        productos.merge(6,"Producto especial",biFunction);

        for (Map.Entry mymap : productos.entrySet()){
           System.out.println(mymap.getKey() +"-" + mymap.getValue());
       }
    }
}
