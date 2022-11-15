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

        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        completableFuture.get();
        completableFuture.complete("complete successfully");
    }

    private static void delay(long secs){
        try{
            TimeUnit.SECONDS.sleep(secs);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
