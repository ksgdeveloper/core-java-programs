package com.shree.thread.project1;

public class UsingThread {

    public static void main(String[] args) {
        //Traditional way of creating Threads
        ThreadDemo demo = new ThreadDemo();
        demo.start();

        //Since java 8
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()
                            + " is running " +i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException exception) {
                        exception.printStackTrace();
                    }
                }
            }
        }).start();
    }
}


class ThreadDemo extends Thread{
    @Override
    public void run() {
        for(int i=0; i<10;i++){
            try {
                System.out.println(Thread.currentThread().getName() + " is running " + i);
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}