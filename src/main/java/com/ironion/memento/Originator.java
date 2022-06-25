package com.ironion.memento;

/**
 * @author ironion
 * @date 2022/6/25 09:46
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento(){
        return new Memento(this.state);
    }

    public void getStateFromMemento(Memento memento){
        this.state = memento.getState();
    }
}
