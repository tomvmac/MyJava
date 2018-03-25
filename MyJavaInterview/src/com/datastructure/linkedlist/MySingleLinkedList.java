package com.datastructure.linkedlist;

import java.util.Hashtable;


/**
 * Merge Sort was from https://www.geeksforgeeks.org/merge-sort-for-linked-list/
 */
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

    // Utility function to get the middle of the linked list
    private SingleLinkedListNode getMiddle(SingleLinkedListNode headNode){
        //Base case
        if (headNode == null)
            return headNode;
        SingleLinkedListNode fastptr = headNode.getNextRef();
        SingleLinkedListNode slowptr = headNode;

        // Move fastptr by two and slow ptr by one
        // Finally slowptr will point to middle node
        while (fastptr != null)
        {
            fastptr = fastptr.getNextRef();
            if(fastptr!=null)
            {
                slowptr = slowptr.getNextRef();
                fastptr=fastptr.getNextRef();
            }
        }
        return slowptr;
    }


    public SingleLinkedListNode mergeSort(SingleLinkedListNode headNode)
    {
        // Base case : if head is null
        if (headNode == null || headNode.getNextRef() == null)
        {
            return headNode;
        }

        // get the middle of the list
        SingleLinkedListNode middle = getMiddle(headNode);
        SingleLinkedListNode nextofmiddle = middle.getNextRef();

        // set the next of middle node to null
        middle.setNextRef(null);

        // Apply mergeSort on left list
        SingleLinkedListNode left = mergeSort(headNode);

        // Apply mergeSort on right list
        SingleLinkedListNode right = mergeSort(nextofmiddle);

        // Merge the left and right lists
        SingleLinkedListNode sortedlist = sortedMerge(left, right);
        return sortedlist;
    }


    private SingleLinkedListNode sortedMerge(SingleLinkedListNode a, SingleLinkedListNode b)
    {
        SingleLinkedListNode result = null;
        /* Base cases */
        if (a == null)
            return b;
        if (b == null)
            return a;

        /* Pick either a or b, and recur */
        if (a.getData() <= b.getData())
        {
            result = a;
            result.setNextRef(sortedMerge(a.getNextRef(), b));
        }
        else
        {
            result = b;
            result.setNextRef(sortedMerge(a, b.getNextRef()));
        }
        return result;

    }

}
