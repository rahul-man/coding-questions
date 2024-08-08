package com.java.codeinterview.searching;

/*
 * For Binary search array has to be sorted
 * Divide the array into 2 halves left and right
 *int[] arr = {12, 32, 8, 10, 3, 56, 5, 21, 11};
 * sorted array = int arr [] = {3, 5, 8, 10, 11, 12, 21, 32, 56}
 * key = 10
 * find middle element and check key > or < == middle
 * if in key  == middle return mid
 * if middle > element search in left
 * if key > middle element search in right
 * else return -1
 * */


import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {12, 32, 8, 10, 3, 56, 5, 21, 11};
        int i = binarySearch(arr, 21);
        System.out.println("Key is at: " + i);
    }

    private static int binarySearch(int[] arr, int key) {
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
