package com.java.codeinterview.array;

import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {

        int[] nums = {3, 3, 4};

        Map<Integer, Integer> map = new HashMap<>();
        for (int ele : nums) {
            if (map.containsKey(ele)) {
                map.put(ele, map.get(ele) + 1);
            } else {
                map.put(ele, 1);
            }
        }
        int max = 0;
        int key = 0;
        for(int ele : map.keySet()){
            if(map.get(ele) > max) {
                max = map.get(ele);
                key = ele;
            }
        }
        System.out.println(key);
    }
}
