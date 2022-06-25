package com.ironion.state;

/**
 * @author ironion
 * @date 2022/6/25 10:39
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("stopping ......");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stopped";
    }
}
