package com.shree.thread.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CallableDemo callableDemo = new CallableDemo(5);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Long> result = executorService.submit(callableDemo);

        System.out.println(result.get());
        System.out.println(result.isDone());

        if(result.isDone()){
            executorService.shutdown();
        }

    }
}
