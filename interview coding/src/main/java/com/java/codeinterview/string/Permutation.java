package com.java.codeinterview.string;

public class Permutation {

    public static void main(String[] args) {
        String s = "ABC";
        permutation(0, s);
    }

    private static void permutation(int index, String s) {
        int len = s.length();
        //base
        if(index == len - 1){
            System.out.println(s);
            return;
        }
        for (int i = index; i < len; i++) {
            s = swap(s, index, i);
            permutation(index + 1, s);
            s = swap(s, index, i);
        }
    }

    private static String swap(String s, int index, int i) {
        char[] ch = s.toCharArray();
        char temp = ch[index];
        ch[index] = ch[i];
        ch[i] = temp;
        return String.valueOf(ch);
    }
}
