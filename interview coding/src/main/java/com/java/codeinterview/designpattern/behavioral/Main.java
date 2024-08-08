package com.java.codeinterview.designpattern.behavioral;

import com.java.codeinterview.designpattern.behavioral.observable.IphoneStockObservable;
import com.java.codeinterview.designpattern.behavioral.observable.Observable;
import com.java.codeinterview.designpattern.behavioral.observers.Observers;
import com.java.codeinterview.designpattern.behavioral.observers.SMSAlertObservers;

public class Main {

    public static void main(String[] args) {

        Observable observable = new IphoneStockObservable();
        Observers observers = new SMSAlertObservers("+919880323527", observable);
        observable.add(observers);
        observable.setData(10);

    }
}
