package com.shree.thread.callable;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable<Long> {
    int num;

    CallableDemo(int num){
        this.num = num;
    }
    @Override
    public Long call() throws Exception {
        Long factorial = 1l;
        for(int i=1; i<=num; i++)
            factorial *= i;
        return factorial;
    }
}
