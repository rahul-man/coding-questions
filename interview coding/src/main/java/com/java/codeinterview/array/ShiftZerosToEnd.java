package com.java.codeinterview.array;

import java.util.Arrays;

public class ShiftZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 0, 0, 1};
        int k = 0;
        for (int ele : arr) {
            if (ele != 0) {
                arr[k++] = ele;
            }
        }

        for (int i = k; i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
