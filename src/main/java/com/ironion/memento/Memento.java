package com.ironion.memento;

/**
 * @author ironion
 * @date 2022/6/25 09:45
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
