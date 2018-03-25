package com.players;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayerExample {



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
//        for (PlayerInfo playerInfo: playerInfoList){
//            System.out.println(playerInfo.toString());
//        }

        // Sort list by age
//        Collections.sort(playerInfoList, new Comparator<PlayerInfo>() {
//            @Override
//            public int compare(PlayerInfo o1, PlayerInfo o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

        // Ascending Order
        Collections.sort(playerInfoList, new PlayerAgeComparator());



        // Reverse Order
        //Collections.sort(playerInfoList, Collections.reverseOrder(new PlayerAgeComparator()));

        // display all players
        for (PlayerInfo playerInfo: playerInfoList){
            System.out.println(playerInfo.toString());
        }


        // Find out if a particular player is on the list
        PlayerInfo kobePlayerInfo = new PlayerInfo("Kobe", "Bryant", "Shooting Guard", 36, 78);
        PlayerInfo larryPlayerInfo = new PlayerInfo("Larry", "Bird", "Shooting Guard", 36, 78);

        boolean kobeOnList = playerInfoList.contains(kobePlayerInfo);
        boolean larryOnList = playerInfoList.contains(larryPlayerInfo);

        System.out.println("Max age = " + ((PlayerInfo) Collections.max(playerInfoList, new PlayerAgeComparator())).getAge());


        // max age


    }
}
