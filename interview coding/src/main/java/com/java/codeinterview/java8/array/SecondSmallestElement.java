package com.java.codeinterview.java8.array;

import java.util.Arrays;

public class SecondSmallestElement {

    public static void main(String[] args) {
        int [] array = {5,2,8,3,1};
        int secondSmallestElement = Arrays.stream(array)
                .sorted()
                .skip(1)
                .min()
                .orElse(0);

        System.out.println(secondSmallestElement);

    }
}
