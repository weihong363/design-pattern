package com.ironion.memento;

/**
 * @author ironion
 * @date 2022/6/25 09:54
 */
public class MementoPatternDemo {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        // this state will be lost
        originator.setState("state1");
        originator.setState("state2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("state3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("state4");
        System.out.println(String.format("current state: %s", originator.getState()));
        int i = 0;
        originator.getStateFromMemento(careTaker.get(i ++));
        System.out.println(String.format("first saved state: %s", originator.getState()));
        originator.getStateFromMemento(careTaker.get(i ++));
        System.out.println(String.format("second saved state: %s", originator.getState()));
    }
}
