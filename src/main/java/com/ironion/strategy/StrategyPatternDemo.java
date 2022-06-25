package com.ironion.strategy;

/**
 * @author ironion
 * @date 2022/6/25 11:39
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context add = new Context(new OperationAdd());
        System.out.println(String.format("add 1 and 2 = %d",add.executeStrategy(1,2)));
        Context subtract = new Context(new OperationSubtract());
        System.out.println(String.format("subtract 1 and 2 = %d",subtract.executeStrategy(1,2)));
        Context multiply = new Context(new OperationMultiply());
        System.out.println(String.format("multiply 1 and 2 = %d",multiply.executeStrategy(1,2)));
    }
}
