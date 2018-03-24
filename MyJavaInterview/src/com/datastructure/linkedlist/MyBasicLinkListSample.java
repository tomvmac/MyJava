package com.datastructure.linkedlist;

public class MyBasicLinkListSample {

    public static void main(String[] args) {

        MySingleLinkedList mySingleLinkedList = new MySingleLinkedList();
        mySingleLinkedList.add(2);
        mySingleLinkedList.add(4);
        mySingleLinkedList.add(6);
        //mySingleLinkedList.deleteFromHead();

        MySingleLinkedList secondList = new MySingleLinkedList();
        secondList.add(4);
        secondList.add(8);

        mySingleLinkedList.merge(secondList);

        mySingleLinkedList.removeDuplicates();

        mySingleLinkedList.traverse();

    }

}
