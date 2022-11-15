package com.shree.thread.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadSynchronizedCodeBlockDemo {

	public static void main(String arg[])  {
		long start = System.currentTimeMillis();
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				Worker worker = new Worker();
				worker.process();
			}
		});
		
		t1.start();
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				Worker worker = new Worker();
				worker.process();
			}
		});
		
		t2.start();
		
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		float running = (float)(end - start)/1000;
		System.out.println( running);
	}

}

class Worker{
	private Random random = new Random();
	private List<Integer> list1 = new ArrayList<>();
	private List<Integer> list2 = new ArrayList<>();
	
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	
	private synchronized void stageOne() {
		synchronized (lock1) {
			try {
				Thread.sleep(1);
			} catch (Exception e) {
			}
			list1.add(random.nextInt(100));
		}
		
	}
	
	private synchronized void stageTwo() {
		synchronized (lock2) {
			try {
				Thread.sleep(1);
			} catch (Exception e) {
			}
			list2.add(random.nextInt(100));
		}
	}
	
	public void process() {
		for (int i = 0; i < 1000; i++) {
			stageOne();
			stageTwo();
		}
	}
	
}
