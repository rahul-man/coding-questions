package com.java.codeinterview.string;

public class LongestHappyString {

    public static void main(String[] args) {
        int a = 1, b = 1, c = 7;
        int max = a + b + c;
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < max; i++){
            if(a >= b && a >= c) {
                if(findIfLastTwoCharacterIsSame(builder, 'a')) {
                    if(b > 0) {
                        builder.append('b');
                        b--;
                    } else if (c > 0){
                        builder.append('c');
                        c--;
                    }
                } else {
                    builder.append('a');
                    a--;
                }
            } else if (b >= c) {
                if (findIfLastTwoCharacterIsSame(builder, 'b')) {
                    if (a > 0) {
                        builder.append('a');
                        a--;
                    } else if (c > 0) {
                        builder.append('c');
                        c--;
                    }
                } else {
                    builder.append('b');
                    b--;
                }
            } else {
                if (findIfLastTwoCharacterIsSame(builder, 'c')) {
                    if (a > 0) {
                        builder.append('a');
                        a--;
                    } else if (b > 0) {
                        builder.append('b');
                        b--;
                    }
                } else {
                    builder.append('c');
                    c--;
                }
            }
        }
        System.out.println(builder);
    }

    private static boolean findIfLastTwoCharacterIsSame(StringBuilder builder, char ch) {
        return builder.length() >= 2 &&
                builder.charAt(builder.length() - 1) == ch &&
                builder.charAt(builder.length() - 2) == ch;
    }
}
