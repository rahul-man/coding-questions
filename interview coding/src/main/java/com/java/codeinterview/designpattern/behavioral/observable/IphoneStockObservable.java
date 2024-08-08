package com.java.codeinterview.designpattern.behavioral.observable;

import com.java.codeinterview.designpattern.behavioral.observers.Observers;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements Observable {

    private int stockCount = 0;
    private List<Observers> observersList = new ArrayList<>();

    @Override
    public void add(Observers observers) {
        observersList.add(observers);
    }

    @Override
    public void remove(Observers observers) {
        observersList.remove(observers);
    }

    @Override
    public void setData(int count) {
        stockCount = stockCount + count;
        notifyObservers();
    }

    @Override
    public int getData() {
        return stockCount;
    }

    @Override
    public void notifyObservers() {
        for (Observers observers : observersList) {
            observers.update();
        }
    }
}
