package com.java.codeinterview.string;

public class MaxNumber {

    public static void main(String[] args) {
        int num = 22341345;

        //Convert num to char array for comparision
        method1(num);
        method2(num);
    }

    private static void method2(int num) {
        char[] array = String.valueOf(num).toCharArray();
        int n = array.length;
        char maxElement = array[n - 1];
        int maxElementIndex = n - 1;
        int swapIndex1 = -1;
        int swapIndex2 = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (array[i] > maxElement) {
                maxElement = array[i];
                maxElementIndex = i;
            } else if(array[i] < maxElement){
                swapIndex1 = i;
                swapIndex2 = maxElementIndex;
            }
        }
        if (swapIndex1 != -1 && swapIndex2 != -1) {
            char temp = array[swapIndex1];
            array[swapIndex1] = array[swapIndex2];
            array[swapIndex2] = temp;
            System.out.println(Integer.parseInt(new String(array)));

        }
    }

    private static void method1(int num) {
        char[] nums = String.valueOf(num).toCharArray();
        int n = nums.length;
        //Store indices of max right element from left to right
        int [] maxRightIndex = new int[n];
        //for the last element the max indices of the element is last element index itself
        maxRightIndex [n - 1] = n - 1;

        //Traverse from right to left and store indices of max right element
        //Since last element index is already stored start from 2nd last indices
        for (int i = n - 2; i >=0 ; i--) {
            //if the current element is greater than next element,
            //store cuurent element index or store the next element index
            maxRightIndex[i] = nums[i] > nums[maxRightIndex[i + 1]] ? i : maxRightIndex[i + 1];
        }

        //Traverse original array and start comparing the element
        for (int i = 0; i < n; i++) {
            int index = maxRightIndex[i];
            //compare current and right max element and swap if right max is bigger
            if(nums[i] < nums[index]){
                char temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            System.out.println(Integer.parseInt(new String(nums)));
           }
        }
    }
}
