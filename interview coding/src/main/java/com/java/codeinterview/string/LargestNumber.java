package com.java.codeinterview.string;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        System.out.println(largestNumber(nums));
    }

    private static String largestNumber(int[] nums) {
        int len = nums.length;
        String[] elements = new String[len];

        for (int i = 0; i < len; i++) {
            elements[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(elements, (a, b) -> (b + a).compareTo(a + b));
        if(elements[0].equals("0")){
            return "0";
        }
        StringBuilder builder = new StringBuilder();
        for (String val : elements){
            builder.append(val);
        }
        return builder.toString();
    }
}
