package com.java.codeinterview.array.slidingwindows;

import java.util.Arrays;
import java.util.List;

public class MaxSubArraySum {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100, 200, 300, 400);
        long maxSum = findMaxSum(2, 4, list);
        System.out.println(maxSum);
    }

    private static long findMaxSum(int K, int N, List<Integer>Arr) {
        long windowSum = 0;
        for(int i = 0; i < K; i++){
            windowSum+= Arr.get(i);
        }
        long currentWindowSum = windowSum;
        for(int j = K; j < N; j++){
            currentWindowSum = (currentWindowSum + Arr.get(j)) - Arr.get(j - K);
            windowSum = Math.max(currentWindowSum, windowSum);
        }
        return windowSum;
    }
}
