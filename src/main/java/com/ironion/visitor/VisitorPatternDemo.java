package com.ironion.visitor;

/**
 * @author ironion
 * @date 2022/6/25 12:25
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new ComputePartDisplayVisitor());
    }
}
