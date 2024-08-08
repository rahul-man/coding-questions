package com.java.codeinterview.designpattern.creational.factory;

public class TestNotification {

    public static void main(String[] args) {
        Notification notification = NotificationFactory.getInstance("EMAIL");
        notification.send();
    }
}
