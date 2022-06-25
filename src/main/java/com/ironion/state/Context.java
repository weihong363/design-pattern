package com.ironion.state;

/**
 * @author ironion
 * @date 2022/6/25 10:39
 */
public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
