package com.ironion.visitor;

/**
 * @author ironion
 * @date 2022/6/25 12:24
 */
public class ComputePartDisplayVisitor implements ComputePartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying computer.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying keyboard.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying mouse.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying monitor.");
    }
}
