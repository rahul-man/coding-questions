package com.java.codeinterview.array;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {

        int target = 5;

        int[] intArr = {1, 2, 5, 12, 7, 3, 8};
        Arrays.stream(intArr)
                .filter(value -> value != target)
                .forEach(System.out::println);

        //normal
        int k = 0;
        int newArray[] = new int[intArr.length - 1];
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] != target) {
                newArray[k++] = intArr[i];
            }
        }

        System.out.println(Arrays.toString(newArray));
    }
}
