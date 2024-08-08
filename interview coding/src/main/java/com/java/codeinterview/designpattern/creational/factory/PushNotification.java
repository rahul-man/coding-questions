package com.java.codeinterview.designpattern.creational.factory;

public class PushNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Sending PUSH Notification");
    }
}
