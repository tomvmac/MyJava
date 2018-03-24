package com.algorithm.sort;

/**
 * Selection Sort
 *
 * Strategy:  Find the smallest unsorted element and add it end of the sort list
 *
 * Execution Steps:
 * 1. Repeat until no unsorted elements remain
 * 2. Search unsorted part of the data to find the smallest value
 * 3. Swap smallest found value with first element of the unsorted part
 *
 */

public class MySelectionSort {

    public static int[] doSelectionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++)
        {
            // Designate an index
            int index = i;

            // Find the smallest number, each time scanning one less than the total
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            int smallestNumber = arr[index];

            // swap smallest number from its current position to the current index position
            arr[index] = arr[i];
            arr[i] = smallestNumber;
        }
        return arr;
    }

    public static void main(String a[]){

        int[] arr1 = {5,1,12,-5,16,2,12,14};
        int[] arr2 = doSelectionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
}