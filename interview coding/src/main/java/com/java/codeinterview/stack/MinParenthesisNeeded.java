package com.java.codeinterview.stack;

import java.util.Stack;

public class MinParenthesisNeeded {

    public static void main(String[] args) {
        String str = "()))((";
        System.out.println(minInsertion(str));
    }

    private static int minInsertion(String str) {
        int count = 0;
        Stack<Character> stack = new Stack<>();
        if (str.isEmpty()) {
            return 0;
        } else {
            for (Character ch : str.toCharArray()) {
                if (ch == '(') {
                    stack.push(ch);
                } else if (stack.isEmpty()) {
                    count++;
                } else {
                    stack.pop();
                }
            }
        }
        return count + stack.size();
    }
}
