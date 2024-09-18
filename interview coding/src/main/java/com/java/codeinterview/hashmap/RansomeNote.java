package com.java.codeinterview.hashmap;

import java.util.HashMap;
import java.util.Map;

public class RansomeNote {
    public static void main(String[] args) {
        String ransomNote = "fihjjjjei";
        String magazine = "hjibagacbhadfaefdjaeaebgi";
        boolean flag = false;
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : magazine.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (int j = 0; j < ransomNote.length(); j++) {
            if (map.containsKey(ransomNote.charAt(j)) && map.get(ransomNote.charAt(j)) != 0) {
                map.put(ransomNote.charAt(j), map.get(ransomNote.charAt(j)) - 1);
                flag = true;
            } else {
                flag = false;
            }
        }
        System.out.println(flag);
    }
}
