package com.example.entrenamiento._7_Concurrency.ExecutorService;

import java.util.concurrent.*;

class Proceso implements Callable<String>{

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 3; i++) {
            System.out.println("El usuario " + i + " se acaba de registrar");
        }
        return "";
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.execute(()-> System.out.println("Incio de operaciones"));
        Proceso proceso = new Proceso();
        proceso.call();
        Callable<Integer> task = ()-> {
            for (int i = 10; i < 13; i++) {
                System.out.println("El usuario " + i + " se acaba de registrar");
            }
            return 3;
        };

        Future<Integer> result =  executorService.submit(task);
        System.out.println(result.get());
        executorService.shutdown();

        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.schedule(()-> System.out.println("Cuenta actulizada"),4,TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(()-> System.out.println("Transferencia realizada"),2,1,TimeUnit.SECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(()-> System.out.println("Transferencia recibida"),4, 2,TimeUnit.SECONDS);
    }
}