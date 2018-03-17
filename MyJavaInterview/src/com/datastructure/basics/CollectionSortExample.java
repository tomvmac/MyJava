package com.datastructure.basics;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortExample {

    public static void main(String [] args){
        ArrayList<Apple> apples = new ArrayList<>();

        apples.add(new Apple("Green", 14));
        apples.add(new Apple("Red", 11));
        apples.add(new Apple("Yellow", 18));

        Collections.sort(apples);

        for (Apple apple: apples){
            System.out.println(apple.toString());
        }

        System.out.println("Reverse order");
        Collections.reverse(apples);
        for (Apple apple: apples){
            System.out.println(apple.toString());
        }

    }
}
