package com.java.codeinterview.string;

public class SimilarStringSentences {

    public static void main(String[] args) {
        String s1 = "of";
        String s2 = "A lot of words";
        System.out.println(isSimilar(s1, s2));
    }

    private static boolean isSimilar(String s1, String s2) {
        if(s1.length() < s2.length()){
            return isSimilar(s2, s1);
        }

        String[] words1 = split(s1);
        String[] words2 = split(s2);

        int start = 0;
        int end = words1.length - 1;

        int i = 0;
        int j = words2.length - 1;

        while(i <= j){
            if(words1[start].equals(words2[i])){
                start++;
                i++;
            }
            else if(words1[end].equals(words2[j])){
                end--;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    private static String[] split(String string) {
        return string.split(" ");
    }
}
