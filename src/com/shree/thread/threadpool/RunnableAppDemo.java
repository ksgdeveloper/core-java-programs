package com.shree.thread.threadpool;

public class RunnableAppDemo {
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new RunnableRunner("Thread 1"));
		Thread t2 = new Thread(new AnotherRunnableRunner("Thread 2"));
		
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t1.start();
		t2.start();
		
	}
	
}

class RunnableRunner implements Runnable{
	private String threadName;

	public RunnableRunner(String str) {
		this.threadName = str;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(threadName+ " " +i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class AnotherRunnableRunner implements Runnable{
	private String threadName;

	public AnotherRunnableRunner(String str) {
		this.threadName = str;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i=i+2) {
			System.out.println(threadName+ " " +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}