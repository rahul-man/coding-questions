package com.java.codeinterview.searching;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {12, 32, 8, 10, 3, 56, 5, 21, 11};
        int i = linearSearch(arr, 5);
        System.out.println("Key is at index: " + i);
    }

    private static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
