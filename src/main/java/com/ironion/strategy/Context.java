package com.ironion.strategy;

/**
 * @author ironion
 * @date 2022/6/25 11:37
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b){
        return strategy.doOperation(a, b);
    }
}
