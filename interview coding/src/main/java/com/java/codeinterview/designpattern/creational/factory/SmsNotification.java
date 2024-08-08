package com.java.codeinterview.designpattern.creational.factory;

public class SmsNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Sending SMS Notification");
    }
}
