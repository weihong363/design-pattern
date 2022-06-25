package com.ironion.strategy;

/**
 * @author ironion
 * @date 2022/6/25 11:33
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        return a + b;
    }
}
