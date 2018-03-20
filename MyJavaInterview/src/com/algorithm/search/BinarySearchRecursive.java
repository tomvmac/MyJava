package com.algorithm.search;

public class BinarySearchRecursive {

    int start = 0;
    int end = 0;

    public int binarySearch(int[] inputArr, int start, int end, int key) {

        if (start > end){
            return -1;
        }

        int mid = (start + end) / 2;
        if (key == inputArr[mid]) {
            return mid;
        }
        if (key < inputArr[mid]) {
            end = mid - 1;
            return binarySearch(inputArr, start, end, key);
        } else {
            start = mid + 1;
            return binarySearch(inputArr, start, end, key);
        }

    }

    public static void main(String[] args) {

        BinarySearchRecursive mbs = new BinarySearchRecursive();
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        //int positionFromSearch = mbs.binarySearch(arr, 0, arr.length-1, 14);
        System.out.println("Key 6's position: " + mbs.binarySearch(arr, 0, arr.length-1, 6));
        System.out.println("Key 12's position: " + mbs.binarySearch(arr, 0, arr.length-1, 12));

        int[] arr1 = {6,34,78,123,432,900};
        System.out.println("Key 432's position: "+mbs.binarySearch(arr1, 0, arr1.length-1,432));
    }
}
