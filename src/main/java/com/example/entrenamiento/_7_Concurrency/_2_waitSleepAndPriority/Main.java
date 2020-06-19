package com.example.entrenamiento._7_Concurrency._2_waitSleepAndPriority;

import java.util.ArrayList;
import java.util.List;

class productor implements Runnable {
    List<String> productos = new ArrayList<>();

    public productor(List<String> productos) {
        this.productos = productos;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (productos) {
                productos.add("Producto X");
                System.out.println("Agrego producto");
                productos.notify();
            }
        }
    }
}

class consumidor implements Runnable {
    List<String> productos = new ArrayList<>();

    public consumidor(List<String> productos) {
        this.productos = productos;
    }

    @Override
    public void run() {
        synchronized (productos) {

            try {
                if (productos.size() == 0) {
                    System.out.println("No hay productos , pero el consumidor espera");
                    productos.wait();
                }
                System.out.println("Producto consumido");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}


public class Main {
    public static void main(String[] args) throws InterruptedException {
        //  System.out.println("Hola");
        //  Thread.sleep(4000);
        //  System.out.println("Mundo");
        List<String> productos = new ArrayList<>();
        consumidor c = new consumidor(productos);
        productor p = new productor(productos);
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);
        Thread t4 = new Thread(p);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
