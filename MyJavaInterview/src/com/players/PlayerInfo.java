package com.players;

public class PlayerInfo {

    private String firstName;
    private String lastName;
    private String position;
    private int age;
    private int height;


    public PlayerInfo(String firstName, String lastName, String position, int age, int height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.age = age;
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "PlayerInfo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {

//        if (o == this) return true;
//        if (!(o instanceof PlayerInfo)) {
//            return false;
//        }

        PlayerInfo playerInfo = (PlayerInfo) o;

        return playerInfo.firstName.equals(firstName) &&
                playerInfo.lastName.equals(lastName) &&
                playerInfo.age == age;
    }

}
