package com.java.codeinterview.designpattern.creational.factory;

public class NotificationFactory {

    public static Notification getInstance(String notificationType) {
        if (notificationType.equalsIgnoreCase("SMS")) {
            return new SmsNotification();
        } else if (notificationType.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        } else if (notificationType.equalsIgnoreCase("PUSH")) {
            return new PushNotification();
        } else {
            return null;
        }
    }
}
