package com.java.codeinterview.string;

/*
* A word is considered valid if:

It contains a minimum of 3 characters.
It contains only digits (0-9), and English letters (uppercase and lowercase).
It includes at least one vowel.
It includes at least one consonant.
You are given a string word.

Return true if word is valid, otherwise, return false.

* Example 1:

Input: word = "234Adas"

Output: true

Explanation:

This word satisfies the conditions.

Example 2:

Input: word = "b3"

Output: false

Explanation:

The length of this word is fewer than 3, and does not have a vowel.
*
* */

public class ValidWord {

    public static void main(String[] args) {
        String word = "3pp";
        System.out.println(isValidWord(word));
    }

    private static boolean isValidWord(String word) {
        int vowel = 0;
        int digit = 0;
        int cons = 0;
        if (word.length() < 3) {
            return false;
        }
        char[] chars = word.toLowerCase().toCharArray();
        for (Character c : chars) {
            if(Character.isLetter(c) && (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                vowel++;
            } else if (Character.isDigit(c) && c >= '0' && c <= '9'){
                digit++;
            } else if (Character.isLetter(c)){
                cons++;
            } else {
                return false;
            }
        }
        return (vowel >=1 && cons >=1 && digit >=0);
    }

}
