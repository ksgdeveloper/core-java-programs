package com.shree.thread.runnable;

public class RunnableOddEven {
    public static void main(String[] args) {
        Runnable runnableEven = () -> {
            for (int i = 0; i < 50; i=i++) {
                if(i%2==0){
                    System.out.println("Thread even"+i);
                }
            }
        };
        Runnable runnableOdd = () ->{
            for (int i = 1; i < 50; i=i++) {
                if(i%2!=0){
                    System.out.println("Thread odd"+i);
                }
            }
        };
        Thread tOdd = new Thread(runnableOdd);
        Thread tEven = new Thread(runnableEven);
        tOdd.start();
        tEven.start();
    }
}
