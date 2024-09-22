package com.java.codeinterview.dfs;

import java.util.ArrayList;
import java.util.List;

public class LexoGraphicalNumber {

    public static void main(String[] args) {
        int n = 13;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            getLexicoGraphicalNumber(i, n, list);
        }
        System.out.println(list);
    }

    private static void getLexicoGraphicalNumber(int start, int limit, List<Integer> result) {
        if (start > limit) return;
        result.add(start);
        for (int digit = 0; digit < 10; digit++) {
            int newNumber = (start * 10) + digit;
            if (newNumber <= limit) {
                getLexicoGraphicalNumber(newNumber, limit, result);
            } else {
                break;
            }
        }
    }
}
