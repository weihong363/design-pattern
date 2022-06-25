package com.ironion.state;

/**
 * @author ironion
 * @date 2022/6/25 10:42
 */
public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context(null);
        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
