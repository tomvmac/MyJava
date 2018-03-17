package com.datastructures.sort.com.datastructure.basics;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {


    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<Integer>();
        Set<Apple> applesHashSet = new HashSet<Apple>();
        Set<Apple> applesTreeSet = new TreeSet<Apple>();


        // Set of Integers
        numbers.add(2);
        numbers.add(5);

        // contains
        System.out.println(numbers.contains(8));

        // try to add a duplicate number
        numbers.add(2);

        for (Integer num: numbers){
            System.out.println(num);
        }

        // Hash Set of objects
        applesHashSet.add(new Apple("Green", 14));
        applesHashSet.add(new Apple("Red", 11));
        applesHashSet.add(new Apple("Yellow", 18));

        applesHashSet.add(new Apple("Green", 14));

        System.out.println("Hashset apples");
        for (Apple apple: applesHashSet){
            System.out.println(apple.toString());
        }


        // Tree Set of objects
        System.out.println("Treeset apples");
        applesTreeSet.add(new Apple("Green", 14));
        applesTreeSet.add(new Apple("Red", 11));
        applesTreeSet.add(new Apple("Yellow", 18));

        applesTreeSet.add(new Apple("Green", 14));

        for (Apple apple: applesTreeSet){
            System.out.println(apple.toString());
        }


    }
}
