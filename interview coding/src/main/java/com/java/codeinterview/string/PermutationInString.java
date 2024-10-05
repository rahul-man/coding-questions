package com.java.codeinterview.string;

import java.util.Arrays;

public class PermutationInString {

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean permutation = isPermutation(s1, s2);
        System.out.println(permutation);
    }

    private static boolean isPermutation(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int n1 = s1.length();
        int n2 = s2.length();

        int left = 0;
        int right = n1 - 1;
        while (right < n2) {
            if (isAnargam(s1, s2, left, right)) {
                return true;
            }
            left++;
            right++;
        }
        return false;
    }

    private static boolean isAnargam(String s1, String s2, int left, int right) {
        String string = s2.substring(left, right + 1);
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = string.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);

    }
}
