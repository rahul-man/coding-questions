package com.java.codeinterview.designpattern.creational.factory;

public class EmailNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Sending EMAIL Notification");
    }
}
