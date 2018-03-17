package com.concurrency;

public class MyThread implements Runnable {


    @Override
    public void run() {
        for (int i = 1; i <= 100000001; i++) {
            if (i == 1000000) {
                System.out.print("Thread counter " + i);
            }
        }
    }
}
