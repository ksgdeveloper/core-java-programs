package com.shree.thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		
		ExecutorService executorService =  Executors.newSingleThreadExecutor();
		
		executorService.execute(() -> System.out.println("Asynchronous Task"));

		executorService.shutdown();
	}

}
