package com.java.codeinterview.array;

public class RemoveElementsSortedArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2};
        System.out.println(removeElement(arr));

    }

    private static int removeElement(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[k] != arr[i]) {
                arr[++k] = arr[i];
            }
        }
        return k+1;
    }
}
