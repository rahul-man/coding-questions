package com.java.codeinterview.thread;

public class PrintLetterAndDigitInterThread {

    private static boolean printLetter = true;

    private static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread letter = new Thread(() -> {
            for (char c = 'A'; c <= 'Z'; c++) {
                synchronized (lock) {
                    if (!printLetter) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.print(" " + c);
                    printLetter = false;
                    lock.notify();
                }
            }
        });
        Thread digit = new Thread(() -> {
            for (int i = 1; i <= 26; i++) {
                synchronized (lock) {
                    if (printLetter) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.print(" " + i);
                    printLetter = true;
                    lock.notify();
                }
            }
        });

        letter.start();
        digit.start();
        letter.join();
        digit.join();
    }
}
