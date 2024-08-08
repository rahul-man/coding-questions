package com.java.codeinterview.strings;

public class Palindrome {

    public static void main(String[] args) {
        String str = "madam";
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                System.out.println("Not Palindrome");
                break;
            }
        }
        System.out.println("Palindrome");
    }
}
