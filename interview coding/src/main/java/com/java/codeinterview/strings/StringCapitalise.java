package com.java.codeinterview.strings;

/*
 * input: this is java
 * output: This Is Java
 * */

public class StringCapitalise {
    public static void main(String[] args) {
        String str = "this is java";
        capitaliseFirstLetterOfWord(str);
    }

    private static void capitaliseFirstLetterOfWord(String str) {
        StringBuilder newWord = new StringBuilder();
        String[] words = str.split("//s+");
        for (String word : words) {
            char upperCase = Character.toUpperCase(word.charAt(0));
            String capitalisedWord = upperCase + (word.substring(1)).toLowerCase();
            newWord.append(capitalisedWord).append(" ");
        }
        System.out.println(newWord);
    }
}
