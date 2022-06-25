package com.ironion.state;

/**
 * @author ironion
 * @date 2022/6/25 10:39
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("starting ......");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Started";
    }
}
