package com.players;

import java.util.*;

public class PlayerStreamsExample {



    public static List initializePlayers(){
        ArrayList <PlayerInfo> playerInfoList = new ArrayList<>();

        playerInfoList.add(new PlayerInfo("Kobe", "Bryant", "Shooting Guard", 36, 78));
        playerInfoList.add(new PlayerInfo("Lebron", "James", "Small Forward", 30, 80));
        playerInfoList.add(new PlayerInfo("Michael", "Jordan", "Shooting Guard", 60, 78));

        return playerInfoList;
    }

    public static void main(String [] args){

        List <PlayerInfo> playerInfoList = initializePlayers();

        // display all players
        System.out.println("All players");
        playerInfoList
                .stream()
                .forEach(System.out::println);


        // display all players whose position are shooting guards
        System.out.println("--------------------------");
        System.out.println("All Shooting guards");
        playerInfoList
                .stream()
                .filter(s -> s.getPosition().equalsIgnoreCase("Shooting Guard"))
                .forEach(System.out::println);


        // Sort list by age ascending
        System.out.println("--------------------------");
        System.out.println("All Players soted by age");
        playerInfoList
                .stream()
                .sorted(Comparator.comparing(PlayerInfo::getAge))
                .forEach(System.out::println);

        // Sort list by age descending
        System.out.println("--------------------------");
        System.out.println("All Players soted by age descending");
        playerInfoList
                .stream()
                .sorted(Comparator.comparing(PlayerInfo::getAge).reversed())
                .forEach(System.out::println);


        // Find out if a particular player is on the list


        // max age
        System.out.println("--------------------------");
        System.out.println("Max age player");
        Optional<PlayerInfo> maxAgePlayer = playerInfoList
                .stream()
                .max(Comparator.comparing(PlayerInfo::getAge));

        System.out.println(maxAgePlayer.toString());
    }
}
