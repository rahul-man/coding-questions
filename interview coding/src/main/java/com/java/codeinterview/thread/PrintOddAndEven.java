package com.java.codeinterview.thread;

public class PrintOddAndEven {

    private static int count = 1;

    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread oddThread = new Thread(() -> {
            while (count < 20) {
                synchronized (lock) {
                    if (count % 2 == 0) { // if even wait
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.print(" " + count);
                    count++;
                    lock.notify();
                }
            }
        });

        Thread evenThread = new Thread(() -> {
            while (count < 20) {
                synchronized (lock) {
                    if (count % 2 != 0) { // if odd wait
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.print(" " + count);
                    count++;
                    lock.notify();
                }
            }
        });
        oddThread.start();
        evenThread.start();
        try {
            oddThread.join();
            evenThread.join();
        } catch (
                InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
