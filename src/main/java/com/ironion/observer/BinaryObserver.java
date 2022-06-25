package com.ironion.observer;

/**
 * @author ironion
 * @date 2022/6/25 10:15
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println(String.format("binary string: %s", Integer.toBinaryString(subject.getState())));
    }
}
