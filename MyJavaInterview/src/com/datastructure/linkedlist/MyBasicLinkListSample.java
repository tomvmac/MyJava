package com.datastructure.linkedlist;

public class MyBasicLinkListSample {

    public static void main(String[] args) {

        MySingleLinkedList mySingleLinkedList = new MySingleLinkedList();
        mySingleLinkedList.add(6);
        mySingleLinkedList.add(2);
        mySingleLinkedList.add(4);
        //mySingleLinkedList.deleteFromHead();

//        MySingleLinkedList secondList = new MySingleLinkedList();
//        secondList.add(4);
//        secondList.add(1);
//
//        mySingleLinkedList.merge(secondList);
//        mySingleLinkedList.removeDuplicates();

        mySingleLinkedList.mergeSort(mySingleLinkedList.getHead());

        mySingleLinkedList.traverse();

    }

}
