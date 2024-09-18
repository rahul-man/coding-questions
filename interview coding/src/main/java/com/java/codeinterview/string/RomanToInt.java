package com.java.codeinterview.string;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        String s = "MCMXCIV";

        int i = romanToInt(s, map);
        System.out.println(i);
    }

    private static int romanToInt(String s, Map<Character, Integer> map) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if(i == s.length() - 1){
                result = result + map.get(s.charAt(i));
            }
            else if (map.get(s.charAt(i)) > map.get(s.charAt(i + 1))) {
                result = result + map.get(s.charAt(i));
            } else if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                result = result + (map.get(s.charAt(i + 1)) - map.get(s.charAt(i)));
            } else {
                result = result + map.get(s.charAt(i));
            }
        }
        return result;
    }
}
