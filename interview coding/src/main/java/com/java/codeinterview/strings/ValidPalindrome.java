package com.java.codeinterview.strings;

public class ValidPalindrome {

    public static void main(String[] args) {
        String string = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(string));
    }

    private static boolean isPalindrome(String string) {
        char[] charArray = string.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (Character c : charArray) {
            if (Character.isLetterOrDigit(c)) {
                builder.append(Character.toString(c).toLowerCase());
            }
        }
        String original = builder.toString();
        String reverse = builder.reverse().toString();
        return original.equals(reverse);
    }
}
