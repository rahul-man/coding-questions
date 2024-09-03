package com.java.codeinterview.array;

public class ChalkReplace {

    public static void main(String[] args) {
        int[] chalk = {3,4,1,2};
        int k = 25;

        //int i = replaceChalk(chalk, k);
        System.out.println(optimisedSolution(chalk, k));


      //  System.out.println(i);
    }

    private static int optimisedSolution(int[] chalk, int k) {
       int sum = 0;
       for(int ele : chalk){
           sum += ele;
       }
        k = k % sum;
        for (int i = 0; i < chalk.length; i++) {
            if(k < chalk [i]){
                return i;
            }
            k = k - chalk[i];
        }
        return -1;
    }

    private static int replaceChalk(int[] chalk, int k) {
        int i = 0;
        if(k == 1 || chalk.length == 1){
            return 0;
        }
        while (i <= chalk.length - 1){
            k = k - chalk[i];
            i++;
            if (i == chalk.length) {
                if (k < chalk[0]) {
                    return 0;
                } else {
                    i = 0;
                }
            }
            if(k < chalk[i]){
                return i;
            }
        }
        return 0;
    }
}
