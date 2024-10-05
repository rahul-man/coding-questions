package com.java.codeinterview.array;

import java.util.ArrayList;
import java.util.List;


public class ArrayPermutation {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        List<List<Integer>> result = new ArrayList<>();
        permutate(nums, result, 0);
    }

    private static void permutate(int[] nums, List<List<Integer>> result, int index) {
        int n = nums.length;
        if(index == n - 1) {
            List<Integer> list = toList(nums);
            if(!result.contains(list)) {
                result.add(list);
            }
            System.out.println(result);
            return;
        }
        for (int i = index; i < n; i++){
            swapElements(nums, index, i);
            permutate(nums, result, index + 1);
            swapElements(nums, index, i);
        }
    }

    private static void swapElements(int[] nums, int index, int i) {
        int temp = nums[index];
        nums[index] = nums[i];
        nums[i] = temp;
    }

    private static List<Integer> toList(int[] nums) {
        List<Integer> tempList = new ArrayList<>();
        for (int ele : nums) {
            tempList.add(ele);
        }
        return tempList;
    }
}
