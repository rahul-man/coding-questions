package com.java.codeinterview.strings;

/*
 *
 * Two strings str1 and str2 are called isomorphic
 * if there is a one-to-one mapping possible for every character of str1 to every character of str2.
 * And all occurrences of every character in ‘str1’ map to the same character in ‘str2’
 *
 * str1: aab, str2: xxy
 * true -> a with count 2 and b with count 1. x with count 2 and y with count 1
 *
 * str1: aab, str2: xyz
 * false -> a with count 2 and b with count 1. in str2 all are having count 1 and different characters
 *
 * map
 * a -> x
 * b -> y
 *
 * */


import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("aab", "xyz"));
      //  System.out.println(isIsomorphic("aab", "xxy"));
    }

    private static boolean isIsomorphic(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            if (map.containsKey(str1.charAt(i))) {
                if (map.get(str1.charAt(i)) != str2.charAt(i)) {
                    return false;
                }
            } else if (map.containsKey(str2.charAt(i))) {
                return false;
            } else {
                map.put(str1.charAt(i), str2.charAt(i));
            }
        }
        return true;
    }
}
