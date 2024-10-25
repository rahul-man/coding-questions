package com.java.codeinterview;

import java.util.*;

public class Example {

    public static void main(String[] args) {
        List<List<Integer>> nums = new ArrayList<>();
        List<Integer> arr1 = List.of(4,10,15,24,26);
        List<Integer> arr2 = List.of(0, 9, 12, 20);
        List<Integer> arr3 = List.of(5, 18, 22, 30);
        nums.add(arr1);
        nums.add(arr2);
        nums.add(arr3);

        System.out.println(Arrays.toString(findRange(nums)));
    }

    private static int[] findRange(List<List<Integer>> nums) {
        int n = nums.size();
        // To find min and max from each list
        int[] index = new int[n];
        // track the smallest range
        int[] range = new int[] { 0, Integer.MAX_VALUE };

        while (true) {
            int minElement = Integer.MAX_VALUE;
            int maxElement = Integer.MIN_VALUE;
            int minListIndex = 0;
            // find current min and max element in list
            for (int i = 0; i < n; i++) {
                int currentElement = nums.get(i).get(index[i]);
                // update current minimum
                if (currentElement < minElement) {
                    minElement = currentElement;
                    minListIndex = i;
                }
                // update current maximum
                maxElement = Math.max(maxElement, currentElement);
            }

            // update the range if current range is smaller than the existing one
            if (maxElement - minElement < range[1] - range[0]) {
                range[0] = minElement;
                range[1] = maxElement;
            }

            // Goto next element in the list from which minElement was found
            int nextIndex = ++index[minListIndex];
            if (nextIndex == nums.get(minListIndex).size()) {
                break;
            }
        }
        return range;
    }

}
