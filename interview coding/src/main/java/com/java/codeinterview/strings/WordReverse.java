package com.java.codeinterview.strings;

/*
 *Reverse each word
 * input : This is Java
 * output: sihT si avaJ
 *
 */


public class WordReverse {
    public static void main(String[] args) {
        String str = "This is Java";
        reverseWord(str);
    }

    private static void reverseWord(String str) {
        if (str.isEmpty()) {
            System.out.println("Can't be reversed");
        }
        String[] words = str.split(" ");
        StringBuilder reverseWord = new StringBuilder();
        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord.append(word.charAt(i));
            }
            reverseWord.append(" ");
        }
        System.out.println(reverseWord);
    }
}
