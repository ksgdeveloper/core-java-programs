package com.shree.thread.threadpool;

public class ThreadJava8Demo {
	public static void main(String[] args) {
		//Child Thread 1
		
		new Thread(()->{
			for(int i=2; i<=10; i=i+2) {
				System.out.println("Child Thread-1 Even  "+ i);
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
		new Thread(()->{
			for(int i=1; i<=11; i=i+2) {
				System.out.println("Child Thread-2 Odd "+ i);
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
		// Main Thread
		
		for(int j=1; j < 5; j++) {
	         System.out.println("Main Thread: "+ j);
	         try {
	            Thread.sleep(500);
	         } catch(Exception e) {
	            e.printStackTrace();
	         }
	      }
	}
}
