package com.java.codeinterview.string;


/*
 * Given a string, find the first non-repeating character in string and return its index else return -1;
 * input: leetcode
 * output: 0
 *
 * input: loveleetcode
 * output: 2
 *
 */

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharInString {

    public static void main(String[] args) {

        String string = "loveleetcode";
        int firstNonRepeatingCharacter = findFirstNonRepeatingCharacter(string);
        System.out.println(firstNonRepeatingCharacter);

    }

    private static int findFirstNonRepeatingCharacter(String string) {
        int min = Integer.MAX_VALUE;
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            if (!characterIntegerMap.containsKey(string.charAt(i))) {
                characterIntegerMap.put(string.charAt(i), i);
            } else {
                characterIntegerMap.put(string.charAt(i), -1);
            }
        }
        return characterIntegerMap
                .values()
                .stream()
                .filter(integer -> integer > -1)
                .min(Comparator.naturalOrder())
                .orElse(-1);

     /*   for (char c : characterIntegerMap.keySet()) {
            if (characterIntegerMap.get(c) > -1 && characterIntegerMap.get(c) < min) {
                min = characterIntegerMap.get(c);
            }
        }
        return min != Integer.MAX_VALUE ? min : -1;*/
    }
}
