package com.shree.thread.threadpool;

import java.util.Scanner;

public class ThreadSynchronizationDemo {
	public static void main(String[] args) {
		
		ProcessorThread pt = new ProcessorThread();
		pt.start();
		
		System.out.println("Press return to exit");
		
		try(Scanner scanner = new Scanner(System.in);) {
			scanner.nextLine();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		pt.shutdown();
	}
}

class ProcessorThread extends Thread{
	private volatile boolean running = true;
	public void run() {
		while (running) {
			System.out.println(" Hello ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void shutdown() {
		running = false;
	}
}