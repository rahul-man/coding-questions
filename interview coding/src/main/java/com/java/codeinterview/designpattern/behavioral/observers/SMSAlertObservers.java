package com.java.codeinterview.designpattern.behavioral.observers;

import com.java.codeinterview.designpattern.behavioral.observable.Observable;

public class SMSAlertObservers implements Observers {

    private String phoneNo;
    private Observable observable;

    public SMSAlertObservers(String phoneNo, Observable observable) {
        this.phoneNo = phoneNo;
        this.observable = observable;
    }

    @Override
    public void update() {
        int data = observable.getData();
        if (data > 0) {
            System.out.println("Sending SMS to: " + this.phoneNo + " New stocks available. Hurry up!");
        }
    }
}
