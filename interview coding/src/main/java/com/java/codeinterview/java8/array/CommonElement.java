package com.java.codeinterview.java8.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElement {

    public static void main(String[] args) {
        int [] num1 = {1,2,3,4,5};
        int [] num2 = {4,5,6,7,8};

        List<Integer> commonList = Arrays.stream(num1)
                .filter(e1 -> Arrays.stream(num2)
                        .anyMatch(e2 -> e1 == e2))
                .boxed()
                .collect(Collectors.toList());
        System.out.println(commonList);
    }
}
