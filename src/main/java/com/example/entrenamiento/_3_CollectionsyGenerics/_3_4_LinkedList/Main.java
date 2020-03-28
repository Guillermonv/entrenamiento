package com.example.entrenamiento._3_CollectionsyGenerics._3_4_LinkedList;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("elemento 1");
        linkedList.addFirst("elemento 2");
        linkedList.addLast("elemento 3");

        linkedList.stream().forEach(x-> System.out.println(x));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        //REMUEVE Y RETORNA EL ULTIMO ELEMENTO
        System.out.println(linkedList.removeFirst());
        //REMUEVE Y RETORNA EL PRIMER ELEMENTO
        System.out.println(linkedList.removeLast());
        System.out.println("LIST");
        linkedList.stream().forEach(x-> System.out.println(x));



    }
}
