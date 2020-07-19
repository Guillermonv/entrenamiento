package com.example.entrenamiento._7_Concurrency._8_CiclicBarrier;

import java.time.ZoneId;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Zoomanager{
    private void sacarAnimales(){
        System.out.println("Sacando animales");
    }
    private void limpiarJualas(){
        System.out.println("Limpiando Jaulas");
    }
    private void ingresarAnimales(){
        System.out.println("ingresar Animales");
    }
    public void realizarTareas(CyclicBarrier c1 ,CyclicBarrier c2){
        try {
            sacarAnimales();
            c1.await();
            limpiarJualas();
            c2.await();
            ingresarAnimales();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

    }
}

public class Main {
    public static void main(String[] args) {
        ExecutorService service = null;
        CyclicBarrier c1 = new CyclicBarrier(4);
        CyclicBarrier c2 = new CyclicBarrier(4, ()-> System.out.println("todas las jaulas estan limpias"));
         Zoomanager managerZoo = new Zoomanager();
            service = Executors.newFixedThreadPool(4);
            for (int i = 0; i < 4 ; i++) {
                service.submit(()-> managerZoo.realizarTareas(c1,c2));
            }


    }
}
