package com.ironion.observer;

/**
 * @author ironion
 * @date 2022/6/25 10:15
 */
public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(String.format("hex string: %s", Integer.toHexString(subject.getState())));
    }
}
