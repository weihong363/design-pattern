package com.ironion.strategy;

/**
 * @author ironion
 * @date 2022/6/25 11:34
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        return a * b;
    }
}
