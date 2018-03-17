package com.datastructure.basics;

import java.util.HashMap;
import java.util.Map;

public class MapExample {


    public static void main(String[] args) {

        HashMap<String, Integer> playerAgeMap = new HashMap<String, Integer>();

        playerAgeMap.put("Kobe", 36);
        playerAgeMap.put("Lebron", 30);
        playerAgeMap.put("Jordan", 60);

        System.out.println("Jordan is " + playerAgeMap.get("Jordan"));

        // traverse and print map
        for (Map.Entry<String, Integer> entry: playerAgeMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

}
