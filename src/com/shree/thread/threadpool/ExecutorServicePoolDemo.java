package com.shree.thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServicePoolDemo {
	public static void main(String[] args) {
		
		
		ExecutorService executorService1 = Executors.newSingleThreadExecutor();

		ExecutorService executorService2 = Executors.newFixedThreadPool(10);

		ExecutorService executorService3 = Executors.newScheduledThreadPool(10);
		
		executorService1.execute(() -> {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("thread 1 ");
						});
		
		executorService2.execute(new Runnable() {
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("thread 2 ");
			}
		});
		
		executorService3.execute(new Runnable() {
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("thread 3 ");
			}
		});
		
		executorService1.shutdown();
		executorService2.shutdown();
		executorService3.shutdown();
		
		System.out.println("Status Thread Shutdown status 1 " + executorService1.isShutdown());
		System.out.println("Status Thread Shutdown status 2 " + executorService2.isShutdown());
		System.out.println("Status Thread Shutdown status 3 " + executorService3.isShutdown());
		
		System.out.println("Status Thread Terminated status 1 " + executorService1.isTerminated());
		System.out.println("Status Thread Terminated status 2 " + executorService1.isTerminated());
		System.out.println("Status Thread Terminated status 3 " + executorService1.isTerminated());

	}
}
