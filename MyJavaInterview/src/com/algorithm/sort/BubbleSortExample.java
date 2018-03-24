package com.algorithm.sort;

/**
 * Bubble sort
 *
 * Strategy: Sorts a list by comparing two elements at a time and swapping the elements until the end of the list
 *
 * Execution Steps:
 * 1. Move through the entire list twice (one other loop and one inner loop)
 * 2. In the inner loop, compare current value and next value, if current value > next value, swap values
 *
 * Big Notation:
 * 1. Best case: O(n)
 * 2. Avg case: O(n^2)
 * 3. Worst case:
 *
 *
 */

public class BubbleSortExample {
    // logic to sort the elements
    public static void bubble_srt(int array[]) {
        int n = array.length;
        int k;
//        for (int m = n; m >= 0; m--) {
          for (int x=0; x < n-1; x++) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
            printNumbers(array);
        }
    }

    private static void swapNumbers(int i, int j, int[] array) {

        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printNumbers(int[] input) {

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        //int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };

        int[] input = { 5, 2, 88, 6, 23, 12, 8, 45, 34, 0, 1 };

        bubble_srt(input);

    }

}
