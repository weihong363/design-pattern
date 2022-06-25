package com.ironion.observer;

/**
 * @author ironion
 * @date 2022/6/25 10:15
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println(String.format("octal string: %s", Integer.toOctalString(subject.getState())));
    }
}
