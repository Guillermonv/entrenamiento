package com.example.entrenamiento._3_CollectionsyGenerics._7_Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new ArrayDeque<>();
        integerQueue.add(1);
        integerQueue.add(2);
        integerQueue.add(3);
        integerQueue.add(4);
        integerQueue.add(5);
        System.out.println(integerQueue.peek());// SI NO TIENE ELEMENTOS DEVUEVLE NULL
        System.out.println(integerQueue.element());// SI NO TIENE ELEMENTOS ARROJA UN NO SUCH ELEMENT
        integerQueue.poll();// SIMILIAR AL REMOVE
        integerQueue.remove();
        integerQueue.offer(1);

        System.out.println("QUEUE");
        integerQueue.stream().forEach(x-> System.out.println(x));

        System.out.println("DEQUE");
        Deque<Integer> integerDeque = new ArrayDeque<>();
        integerDeque.add(1);
        integerDeque.add(2);
        integerDeque.add(3);
        integerDeque.add(4);
        integerDeque.add(5);

        integerDeque.addFirst(0);
        integerDeque.addLast(6);
        System.out.println(integerDeque.peekFirst()); // PRINT ELEMENT AND NOT REMOVE
        System.out.println(integerDeque.peekLast());
        integerDeque.removeFirst();
        integerDeque.pollLast();//REMUEVE LAST
        System.out.println(integerDeque.pop()); // REMOVES AND RETURN DE ELEMENT
        System.out.println("ITERO DEQUE");
        integerDeque.stream().forEach(x-> System.out.println(x));

    }

}
