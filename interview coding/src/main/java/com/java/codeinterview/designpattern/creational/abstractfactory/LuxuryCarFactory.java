package com.java.codeinterview.designpattern.creational.abstractfactory;

public class LuxuryCarFactory implements CarFactory {

    @Override
    public Car getCar() {
        return new Mercedes();
    }
}
