package com.ironion.observer;

/**
 * @author ironion
 * @date 2022/6/25 10:18
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexObserver(subject);
        subject.setState(15);
        subject.notifyAllObserves();
        System.out.println("=================");
        subject.setState(10);
        subject.notifyAllObserves();
    }
}
