package com.java.codeinterview.array;

public class MinElementAfterDigitSum {

    public static void main(String[] args) {
        int [] nums = {10, 12, 13, 14};
        int result = Integer.MAX_VALUE;
        for (int num : nums) {
             result = Math.min(result, getMinElement(num));
        }
        System.out.println(result);
    }

    private static int getMinElement(int num) {
        int sum = 0;
            while(num > 0){
                int rem = num % 10;
                sum = sum + rem;
                num = num / 10;
            }
        return sum;
    }
}
