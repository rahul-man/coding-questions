package com.java.codeinterview.strings;

/*
 * input: Hello World
 * Output: Hell Wrld
 *
 * */

public class RemoveOccurrence {

    public static void main(String[] args) {
        String str = "Hello world";
        String replaced = str.replaceAll("o", "");
        System.out.println(replaced);


        removeCharacter(str, 'o', "");
    }

    private static void removeCharacter(String str, char charToRemove, String replacement) {
        StringBuilder replacedChar = new StringBuilder();
        char[] array = str.toLowerCase().toCharArray();
        for (Character c : array) {
            if (!c.equals(charToRemove)) {
                replacedChar.append(c);
            }
            replacedChar.append(replacement);
        }
        System.out.println(replacedChar);
    }
}
