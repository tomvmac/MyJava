package com.datastructure.linkedlist;

import java.util.Hashtable;

public class MySingleLinkedList {

    private SingleLinkedListNode head;
    private SingleLinkedListNode tail;

    public SingleLinkedListNode getHead() {
        return head;
    }

    public void setHead(SingleLinkedListNode head) {
        this.head = head;
    }

    public SingleLinkedListNode getTail() {
        return tail;
    }

    public void setTail(SingleLinkedListNode tail) {
        this.tail = tail;
    }


    public void add (Integer data){
        SingleLinkedListNode node = new SingleLinkedListNode();
        node.setData(data);

        // check if list is empty
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNextRef(node);
            tail = node;
        }

    }

    public void deleteFromHead(){
        SingleLinkedListNode tmp = new SingleLinkedListNode();

        if (head == null){
            System.out.println("Under flow, empy list");
            return;
        }

        head = head.getNextRef();
    }


    public void traverse() {
        SingleLinkedListNode tmp = head;

        while (true){
            if (tmp == null){
                break;
            }
            System.out.print(tmp.getData() + ",");
            tmp = tmp.getNextRef();
        }

    }



    public void merge(MySingleLinkedList listToMerge){

        // link tail to new list head
        if (listToMerge != null) {
            if (listToMerge.getHead() != null && listToMerge.getTail()!= null) {
                tail.setNextRef(listToMerge.getHead());
            }
        }

        // traverse new list to the end and set tail to the
        tail = listToMerge.getTail();


    }


    public void removeDuplicates(){

        Hashtable <Integer, Integer> existValuesTable = new Hashtable();
        SingleLinkedListNode tmp = head;
        SingleLinkedListNode tmpNext;

        if (head != null){
            existValuesTable.put(head.getData(), head.getData());
        }

        // traverse list
        while (true){
            if (tmp == null){
                break;
            }

            tmpNext = tmp.getNextRef();

            if (tmpNext != null) {

                // check if node value is in hash table
                if (existValuesTable.contains(tmpNext.getData())) {
                    // remove duplicate
                    tmp.setNextRef(tmpNext.getNextRef());
                } else {
                    existValuesTable.put(tmp.getData(), tmp.getData());
                }
            }

            tmp = tmp.getNextRef();
        }



    }

}
