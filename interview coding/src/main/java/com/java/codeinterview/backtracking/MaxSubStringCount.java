package com.java.codeinterview.backtracking;

import java.util.HashSet;
import java.util.Set;

public class MaxSubStringCount {
    static int maxCount = 0;
    public static void main(String[] args) {
        String s = "ababccc";
        Set<String> set = new HashSet<>();
        findMaxCount(s, 0, set);
        System.out.println(maxCount);
    }

    private static void findMaxCount(String s, int index, Set<String> set) {
        int n = s.length();
        if (index == n) {
            maxCount = Math.max(maxCount, set.size());
            return;
        }
        for (int i = index; i < n; i++) {
            String subString = s.substring(index, i + 1);
            if (!set.contains(subString)) {
                set.add(subString);
                findMaxCount(s, i + 1, set);
                set.remove(subString);
            }
        }
    }
}
