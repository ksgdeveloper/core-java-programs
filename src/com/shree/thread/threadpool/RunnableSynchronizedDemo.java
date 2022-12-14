package com.shree.thread.threadpool;

public class RunnableSynchronizedDemo {

	public static void main(String[] args) {
		App app = new App();
		app.doWork();
	}

}

class App{
	private int count = 0;
	
	private synchronized void increment() {
		count++;
	}
	
	public void doWork() {
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					increment();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					increment();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println("Count "+ count);
		
	}
	
	
}