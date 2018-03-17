package com.datastructures.sort.com.players;

import java.util.Comparator;

public class PlayerAgeComparator implements Comparator<PlayerInfo>{

    public int compare(PlayerInfo playerInfo1, PlayerInfo playerInfo2){
        if (playerInfo1.getAge() > playerInfo2.getAge())
            return playerInfo1.getAge();

        return playerInfo2.getAge();
    }

}
