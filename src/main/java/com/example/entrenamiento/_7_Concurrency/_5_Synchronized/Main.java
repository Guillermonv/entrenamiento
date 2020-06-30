package com.example.entrenamiento._7_Concurrency._5_Synchronized;

class Contador {
    public void contar(int n) throws InterruptedException {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(400);
                System.out.println(i * n);
            }
        }
    }
}

class Thread1 extends Thread{
    Contador contador;

    public Thread1(Contador contador) {
        this.contador = contador;
    }

    @Override
    public void run() {
        try {
            contador.contar(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Thread2 extends Thread{
    Contador contador;

    public Thread2(Contador contador) {
        this.contador = contador;
    }

    @Override
    public void run() {
        try {
            contador.contar(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Main{
    public static void main(String args[]) {
            Contador obj = new Contador();
            Thread1 thread1 = new Thread1(obj);
            Thread2 thread2 = new Thread2(obj);

            thread1.start();
            thread2.start();
    }
}