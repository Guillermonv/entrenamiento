package com.example.entrenamiento._7_Concurrency._4_MultiThreading;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class CallableTask implements Callable<String>{

    String mensaje;
    LocalDateTime time;

    public CallableTask(String mensaje, LocalDateTime time) {
        this.mensaje = mensaje;
        this.time = time;
    }

    @Override
    public String call() throws Exception {
        return mensaje + " - " + time;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // int nThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        List<Callable<String>> callableList = new ArrayList<>();

        for (int i = 0; i < 100 ; i++) {
            Thread.sleep(13);
            callableList.add(new CallableTask("mensaje "+ i, LocalDateTime.now()));
        }
        List<Future<String>> futureList = executorService.invokeAll(callableList);

        String future = executorService.invokeAny(callableList);
        System.out.println(future);
      /*  for (Future<String> future : futureList){
            System.out.println("imprimiendo future "  + future.get());
        }

       */
      executorService.shutdownNow();
    }
}


