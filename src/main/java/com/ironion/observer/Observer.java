package com.ironion.observer;
 /**
 * @author  ironion
 * @date  2022/6/25 10:05
 */
public abstract class Observer {

    Subject subject;

    public abstract void update();
}
