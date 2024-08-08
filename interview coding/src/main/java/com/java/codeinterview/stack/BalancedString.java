package com.java.codeinterview.stack;

import java.util.Stack;

public class BalancedString {

    public static void main(String[] args) {

        String input = "()[{}()]";
        System.out.println(checkBalancedString(input));
    }

    private static String checkBalancedString(String input) {

        if (input.isEmpty()) {
            return "Not Balanced";
        }

        Stack<Character> stack = new Stack<>();
        char[] charArray = input.toCharArray();
        for (Character currentCharacter : charArray) {
            if (currentCharacter == '(' || currentCharacter == '[' || currentCharacter == '{') {
                stack.push(currentCharacter);
            }
            if (stack.empty()) {
                return "Not Balanced";
            } else {
                Character lastCharacter = stack.peek();
                if ((lastCharacter == '(' && currentCharacter == ')') ||
                        (lastCharacter == '{' && currentCharacter == '}') ||
                        (lastCharacter == '[' && currentCharacter == ']'))
                    stack.pop();
            }
        }
        return stack.empty() ? "Balanced" : "Not Balanced";
    }
}
