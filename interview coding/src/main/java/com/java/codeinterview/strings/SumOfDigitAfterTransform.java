package com.java.codeinterview.strings;

public class SumOfDigitAfterTransform {

    public static void main(String[] args) {
        String s = "zbax";
        int k = 2;
        int count = 0;
        int sum = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (Character ch : s.toUpperCase().toCharArray()) {
            int digit = ch - 'A' + 1;
            stringBuilder.append(digit);
        }
        System.out.println(stringBuilder);
        String[] digits = stringBuilder.toString().split("");
        sum = getSum(digits, sum);
        count++;
        while (count < k) {
            sum = transFormAgain(sum);
            count++;
        }
        System.out.println(sum);
    }

    private static int transFormAgain(int sum) {
        int total = 0;
        while(sum > 0){
            int rem = sum % 10;
            total = total + rem;
            sum = sum / 10;
        }
        return total;
    }

    private static int getSum(String[] digits, int sum) {
        for (String digit : digits) {
            sum += Integer.parseInt(digit);
        }
        return sum;
    }
}
