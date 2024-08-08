package com.java.codeinterview.stack;

public class CustomStack {

    private int size;
    private int[] data;
    private int top;

    private static final int DEFAULT_SIZE = 5;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int maxSize) {
        this.size = maxSize;
        this.data = new int[size];
        this.top = -1;
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        data[++top] = item;
        return true;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return data[top];
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        System.out.print(data[top--] + "->");
    }

    private boolean isFull() {
        return (top == data.length - 1);
    }

    private boolean isEmpty() {
        return top < 0;
    }


}
