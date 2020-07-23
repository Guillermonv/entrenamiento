package com.example.entrenamiento._7_Concurrency._9_ForkJoinPool;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

class TransaccionAction extends RecursiveAction{
int start;
int end ;
int []pesos;

    public TransaccionAction(int start, int end, int[] pesos) {
        this.start = start;
        this.end = end;
        this.pesos = pesos;
    }

    @Override
    protected void compute() {
      if((end - start) <= 3){
          for (int i = start; i < end ; i++) {
              System.out.println("Enviando dinero " + pesos[i]);
          }
      }else{
          int middle = start + ((end-start)/2);
          System.out.println("start " + start + "middle " + middle + "end " + end);
          invokeAll(new TransaccionAction(start,middle,pesos),new TransaccionAction(middle,end,pesos));
      }

    }
}


class TransaccionTask extends RecursiveTask<Integer> {
    int start;
    int end ;
    int []pesos;

    public TransaccionTask(int start, int end, int[] pesos) {
        this.start = start;
        this.end = end;
        this.pesos = pesos;
    }

    @Override
    protected Integer compute() {
        if((end - start) <= 3){
            int suma = 0 ;
            for (int i = start; i < end ; i++) {
                System.out.println("Enviando dinero " + pesos[i]);
                suma += pesos[1];
            }
            return  suma;
        }else{
            int middle = start + ((end-start)/2);
            System.out.println("start " + start + "middle " + middle + "end " + end);
            RecursiveTask<Integer> task = new TransaccionTask(start,middle,pesos);
            task.fork();
            return new TransaccionTask(middle,end,pesos).compute() + task.join();
        }

    }
}
public class Main {
    //Create forkJoinTask ForkJoinTask<?>
    //Create ForkJoinPool
    //start forkjoin pool.inoke task
    public static void main(String[] args) {
        int[] pesos = {2000,12311,1299,15000,40000,500011,541211,77731};
        ForkJoinTask<?> task = new TransaccionAction(0,5,pesos);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(task);

        ForkJoinTask<?> task2 = new TransaccionTask(0,5,pesos);
        ForkJoinPool pool2 = new ForkJoinPool();
        System.out.println( pool2.invoke(task2));


    }
}

