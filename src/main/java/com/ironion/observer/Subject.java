package com.ironion.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ironion
 * @date 2022/6/25 10:06
 */
public class Subject {

    private List<Observer> observers;

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void attach(Observer observer) {
        if (null == observers){
            observers = new ArrayList<>();
        }
        observers.add(observer);
    }

    public void notifyAllObserves() {
        observers.forEach(observer -> observer.update());
    }
}
