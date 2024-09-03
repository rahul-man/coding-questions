package com.java.codeinterview.array;

public class MajorityElement {
    public static void main(String[] args) {
        int [] nums = new int[]{3,3,4};
        int candidate = 0;
        int count = 0;
        for(int i = 0; i<nums.length; i++){
             if(candidate == nums[i]){
                count++;
            } else if(count == 0){
                candidate = nums[i];
                }
            else {
                count--;
            }
        }
        System.out.println(candidate);
    }
}
