package com.shree.thread.threadpool;

public class ThreadAppDemo {

	public static void main(String[] args) {
		Runner runner1 = new Runner();
		runner1.setName("runner 1");
		runner1.start();
		
		Runner runner2 = new Runner();
		runner2.setName("runner 2");
		runner2.start();
	}

}

class Runner extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(this.getName() + " " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}