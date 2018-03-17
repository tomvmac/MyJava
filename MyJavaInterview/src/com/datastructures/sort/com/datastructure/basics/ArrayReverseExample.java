package com.datastructures.sort.com.datastructure.basics;

public class ArrayReverseExample {

    /* Function to reverse arr[] from start to end*/
    static void reverseArray(int arr[]) {
        int temp = 0;
        int start = 0;
        int end = arr.length - 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (start >= end)
                return;
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start = start + 1;
            end = end - 1;

        }
    }

    /* Utility that prints out an array on a line */
    static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr, 6);
        reverseArray(arr);
        System.out.println("Reversed array is ");
        printArray(arr, 6);
    }

}
