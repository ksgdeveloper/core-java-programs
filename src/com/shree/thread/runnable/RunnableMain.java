package com.shree.thread.runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableMain {
    public static void main(String[] args) {
        RunnableDemo runnableDemo = new RunnableDemo();
        Thread t = new Thread(runnableDemo);
        //t.start();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(t);

        executorService.shutdown();
    }
}
