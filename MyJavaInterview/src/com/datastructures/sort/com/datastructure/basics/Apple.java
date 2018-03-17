package com.datastructures.sort.com.datastructure.basics;


import com.datastructures.sort.com.players.PlayerInfo;

import java.util.Objects;

public class Apple implements Comparable<Apple> {
    private String color;
    private int weight;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Apple other) {
        if (this.weight < other.weight) {
            return -1;
        }
        if (this.weight == other.weight) {
            return 0;
        }
        return 1;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {

//        if (o == this) return true;
//        if (!(o instanceof PlayerInfo)) {
//            return false;
//        }

        Apple apple = (Apple) o;

        return apple.color.equals(color) &&
                apple.weight == (weight);
    }


    @Override
    public int hashCode() {
        return Objects.hash(color, weight);
    }


}