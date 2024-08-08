package com.java.codeinterview.stack;

import java.util.Stack;

public class BalancedString {

    private static final String BALANCED = "Balanced";
    private static final String NOT_BALANCED = "Not Balanced";

    public static void main(String[] args) {

        String input = "()[{}()]";
        if (input.isEmpty()) {
            System.out.println(NOT_BALANCED);
        }
        System.out.println(checkBalancedString(input));
    }

    private static String checkBalancedString(String input) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = input.toCharArray();
        for (Character currentCharacter : charArray) {
            if (currentCharacter == '(' || currentCharacter == '[' || currentCharacter == '{') {
                stack.push(currentCharacter);
            } else if (stack.empty()) {
                return NOT_BALANCED;
            } else {
                Character lastCharacter = stack.peek();
                if (
                        (lastCharacter == '(' && currentCharacter == ')') ||
                                (lastCharacter == '{' && currentCharacter == '}') ||
                                (lastCharacter == '[' && currentCharacter == ']')
                )
                    stack.pop();
            }
        }
        return stack.empty() ? BALANCED : NOT_BALANCED;
    }
}
