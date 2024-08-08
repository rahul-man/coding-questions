package com.java.codeinterview.designpattern.creational.abstractfactory;

public class Client {

    private Car car;

    public Client(CarFactory carFactory) {
        this.car = carFactory.getCar();
    }

    void disp() {
        car.topSpeed();
    }

    public static void main(String[] args) {
        CarFactory factory = new LuxuryCarFactory();
        Client client = new Client(factory);
        client.disp();
    }

}
