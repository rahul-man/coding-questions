package com.java.codeinterview.stack;

public class ReverseWord {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        reverseWord(word, ch);


    }

    private static void reverseWord(String word, char ch) {
        int pos = 0;
        StringBuilder stringBuilder = new StringBuilder();
        if (word.contains(Character.toString(ch))) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == ch) {
                    pos = i;
                    break;
                }
            }
            stringBuilder.append(word.substring(0, pos+1)).reverse().append(word.substring(pos + 1));
        }
        System.out.println(stringBuilder);
    }
}
