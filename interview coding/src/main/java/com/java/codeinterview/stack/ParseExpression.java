package com.java.codeinterview.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ParseExpression {

    public static void main(String[] args) {
        String expression = "|(f,f,f,t)";
        Stack<Character> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (ch != ',' && ch != ')') {
                stack.push(ch);
            } else if (ch == ')') {
                List<Character> list = new ArrayList<>();
                while (stack.peek() != '(') {
                    list.add(stack.pop());
                }
                stack.pop();
                char operator = stack.peek();
                stack.push(evalExpression(list, operator));
            }
        }
        System.out.println(stack.peek() == 't') ;
    }

    private static Character evalExpression(List<Character> list, char operator) {
        if (operator == '&') {
            return list.stream().anyMatch(character -> character == 'f') ? 'f' : 't';
        }
        if (operator == '|') {
            return list.stream().anyMatch(character -> character == 't') ? 't' : 'f';
        }
        if(operator == '!'){
            return list.get(0) == 'f' ? 't' : 'f';
        }
        return null;
    }
}
