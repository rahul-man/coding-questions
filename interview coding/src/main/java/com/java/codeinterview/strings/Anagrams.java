package com.java.codeinterview.strings;

import java.util.Arrays;

/*
* Input: str1 = “listen”  str2 = “silent”
Output: “Anagram”
Explanation: All characters of “listen” and “silent” are the same.

Input: str1 = “gram”  str2 = “arm”
Output: “Not Anagram”
*/
public class Anagrams {

    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        boolean anagram = isAnagram(s1, s2);
        System.out.println(Boolean.valueOf(anagram));
    }

    private static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();

        System.out.println(array1);

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }
}
