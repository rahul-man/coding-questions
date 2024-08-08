package com.java.codeinterview.hashmap;

//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Input: nums = [3,2,4], target = 6
//Output: [1,2]

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int target = 6;
        int[] array = {3, 2, 4};
        int[] bruteForce = bruteForce(array, target);
        int[] hashmapWay = hashmapWay(array, target);
        System.out.println(Arrays.toString(hashmapWay) + " " + Arrays.toString(bruteForce));
    }

    private static int[] hashmapWay(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int delta = target - array[i];
            if (map.containsKey(delta)) {
                return new int[]{map.get(delta), i};
            }
            map.put(array[i], i);
        }
        return null;

    }

    private static int[] bruteForce(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
