package com.java.codeinterview.designpattern.creational.abstractfactory;

public class OrdinaryCarFactory implements CarFactory {

    @Override
    public Car getCar() {
        return new Swift();
    }
}
