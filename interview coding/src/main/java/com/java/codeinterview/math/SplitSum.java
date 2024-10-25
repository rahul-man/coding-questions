package com.java.codeinterview.math;

import java.util.Arrays;

public class SplitSum {
    public static void main(String[] args) {
        int num = 4325;
        char[] chars = String.valueOf(num).toCharArray();
        Arrays.sort(chars);
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        for (char c : chars){
            if(c % 2 == 0){
                even.append(c);
            } else {
                odd.append(c);
            }
        }
        System.out.println(Integer.parseInt(odd.toString()) + Integer.parseInt(even.toString()));
    }
}
