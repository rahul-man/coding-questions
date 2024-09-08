package com.java.codeinterview.stack;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbcc";

        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if(jewels.contains(Character.toString(stones.charAt(i)))){
                count++;
            }
        }
        System.out.println(count);
    }
}
