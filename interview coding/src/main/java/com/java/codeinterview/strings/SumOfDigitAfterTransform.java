package com.java.codeinterview.strings;

public class SumOfDigitAfterTransform {

    public static void main(String[] args) {
        String s = "iiii";
        int sum = 0;
        int k = 1;
        for (Character ch : s.toUpperCase().toCharArray()) {
            int digit = ch - 'A' + 1;
            sum += tranform(digit);
        }
        while (k > 1) {
            sum = tranform(sum);
            k--;
        }
        System.out.println(sum);
    }

    private static int tranform(int sum) {
        int total = 0;
        while (sum > 0) {
            int rem = sum % 10;
            total = total + rem;
            sum = sum / 10;
        }
        return total;
    }
}
