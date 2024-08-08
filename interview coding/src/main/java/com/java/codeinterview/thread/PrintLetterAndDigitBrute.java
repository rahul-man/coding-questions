package com.java.codeinterview.thread;

public class PrintLetterAndDigitBrute {

    public static void main(String[] args) throws InterruptedException {
        Thread letter = new Thread(() -> {
            for (char c = 'A'; c <= 'Z'; c++) {
                System.out.print(" " + c);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread digit = new Thread(() -> {
            for (int i = 1; i <= 26; i++) {
                System.out.print(" " + i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        letter.start();
        Thread.sleep(1000);
        digit.start();
    }
}
