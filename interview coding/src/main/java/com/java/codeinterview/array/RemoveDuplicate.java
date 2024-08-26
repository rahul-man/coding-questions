package com.java.codeinterview.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] intArr = {1, 2, 2, 5, 1, 6, 12, 7, 12, 12, 3, 8};

        int array [] = {0,0,1,1,1,2,2,3,3,4};

        System.out.println("TOTAL: " + removeDeuplicatesAndReturnCount(array));

        Arrays.stream(intArr)
                .distinct()
                .forEach(System.out::println);
              /*  .toArray();
        System.out.println(Arrays.toString(array));*/


        //Using Hashset

        Set<Integer> set = new HashSet<>();
        for (int ele : intArr){
            set.add(ele);
        }
        System.out.println(set);
    }

    private static int removeDeuplicatesAndReturnCount(int[] array) {
        int i = 0;
        for(int j=0; j<array.length; j++){
            if(array[i]!=array[j]){
                i++;
                array[i] = array[j];
            }
        }
        return i+1;
    }
}
