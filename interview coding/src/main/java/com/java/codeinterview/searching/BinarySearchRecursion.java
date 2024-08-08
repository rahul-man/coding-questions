package com.java.codeinterview.searching;

import java.util.Arrays;

public class BinarySearchRecursion {

    public static void main(String[] args) {
        int[] arr = {12, 32, 8, 10, 3, 56, 5, 21, 11};
        int pos = binarySearch(arr, 21, 0, arr.length - 1);
        System.out.println(pos);
    }

    private static int binarySearch(int[] arr, int keyToSearch, int left, int right) {
        Arrays.sort(arr);
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == keyToSearch) {
                return mid;
            } else if (arr[mid] < keyToSearch) {
                return binarySearch(arr, keyToSearch, mid + 1, right);
            } else
                return binarySearch(arr, keyToSearch, left, mid - 1);
        }
        return -1;
    }
}
