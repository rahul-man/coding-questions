package com.java.codeinterview.array;

public class MaxAndMin {

    public static void main(String[] args) {
        int[] arr = {12, 1, 45, 56, 67, 23, 8, 45};

        int min = arr[0];
        int max = args.length - 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max: " + max + " :: " + "Min: " + min);
    }
}
