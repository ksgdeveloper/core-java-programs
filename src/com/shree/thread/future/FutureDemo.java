package com.shree.thread.future;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executors = Executors.newFixedThreadPool(10);
        Future<List<String>> future = executors.submit(() -> {
            delay(10l);
            return Arrays.asList("1,2,3,4,5");
        });

        System.out.println(future.get());
        executors.shutdown();

        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                // Simulate a long-running Job
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
                System.out.println("I'll run in a separate thread than the main thread.");
            }
        });

        completableFuture.get();
    }

    private static void delay(long secs){
        try{
            TimeUnit.SECONDS.sleep(secs);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
