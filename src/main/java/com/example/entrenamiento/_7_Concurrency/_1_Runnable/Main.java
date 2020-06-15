package com.example.entrenamiento._7_Concurrency._1_Runnable;

class proceso implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

class proceso2 extends Thread {
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println(i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Comienzo");
        Thread thread1 = new Thread(new proceso());
        thread1.start();

        proceso2 thread2 = new proceso2();
        thread2.start();

        Runnable thread3 = ()->{
            for (int i = 21; i <=30 ; i++) {
                System.out.println(i);
            }
        };
        new Thread(thread3).start();

        new Thread(()->{
            for (int i = 31; i <40 ; i++) {
                System.out.println(i);
            }
        }).start();
    }
}
