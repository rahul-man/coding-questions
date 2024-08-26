package com.java.codeinterview.strings;

public class LastWordLength {

    public static void main(String[] args) {
        String s = " Hello   World";
        String[] words = s.trim().split("\\s+");
        int length = words[words.length - 1].length();
        System.out.println(length);
    }
}
