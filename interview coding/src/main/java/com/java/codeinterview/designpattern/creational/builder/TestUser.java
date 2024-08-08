package com.java.codeinterview.designpattern.creational.builder;

public class TestUser {

    public static void main(String[] args) {
        User user = User.builder()
                .email("test@gmail.com")
                .name("test_user")
                .phone("6763284239")
                .build();
        System.out.println(user);
    }
}
