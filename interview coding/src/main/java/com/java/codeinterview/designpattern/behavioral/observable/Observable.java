package com.java.codeinterview.designpattern.behavioral.observable;

import com.java.codeinterview.designpattern.behavioral.observers.Observers;

public interface Observable {

    void add(Observers observers);

    void remove(Observers observers);

    void setData(int count);

    int getData();

    void notifyObservers();
}
