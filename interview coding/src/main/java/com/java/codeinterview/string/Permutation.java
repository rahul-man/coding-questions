package com.java.codeinterview.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutation {

    public static void main(String[] args) {
        String s = "ABC";
        List<String> result = new ArrayList<>();
        permutation(0, s, result);
        Collections.sort(result);
        System.out.println(result);
    }

    private static void permutation(int index, String s, List<String> result) {
        int len = s.length();
        //base
        if(index == len - 1){
            result.add(s);
            return;
        }
        for (int i = index; i < len; i++) {
            s = swap(s, index, i);
            permutation(index + 1, s, result);
            s = swap(s, index, i);
        }
    }

    private static String swap(String s, int index, int i) {
        char[] ch = s.toCharArray();
        char temp = ch[i];
        ch[i] = ch[index];
        ch[index] = temp;
        return String.valueOf(ch);
    }
}
