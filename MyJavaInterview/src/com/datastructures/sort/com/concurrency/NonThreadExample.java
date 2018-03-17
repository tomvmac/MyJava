package com.datastructures.sort.com.concurrency;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class NonThreadExample {

    public static void main(String[] args) {

        System.out.println("Start Time: ");
        Date startTime = new Date();
        System.out.println(startTime.getTime());

        for (int i = 1; i <= 100000001; i++) {
            if (i == 1000001) {
                System.out.print("First counter " + i);
            }
        }

        for (int i = 1; i <= 100000001; i++) {
            if (i == 1000001) {
                System.out.print("Second counter " + i);
            }
        }

        for (int i = 1; i <= 100000001; i++) {
            if (i == 1000001) {
                System.out.print("Main Thread counter " + i);
            }
        }

        System.out.println("-----");
        System.out.println("End Time: ");
        Date endTime = new Date();
        System.out.println(endTime.getTime());

        long elapseTime = endTime.getTime() - startTime.getTime();

        System.out.println("elapse time in milli secs " + elapseTime);
    }

    public static void displayCurrentTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
}
