package com.shree.thread.threadpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceSubmitDemo {
	public static void main(String[] args) {
		//Asynchornous mechanism to execute the tasks concurrently
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		// Future respresents the outcome of the asysnchronous task
		Future future1  = executorService.submit(new Runnable() {
			public void run() {
				System.out.println("Asynchronous Task 1");
			}
		});
		
		Future future2  = executorService.submit(new Runnable() {
			public void run() {
				System.out.println("Asynchronous Task 2");
			}
		});


		try {
			if(future1.get() == null && future2.get() == null) {
				System.out.println("Asynchornous Task 1 and 2 completed successfully");
				System.out.println(executorService.isShutdown());
			}
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		executorService.shutdown();
		
	}
}
