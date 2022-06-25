package com.ironion.visitor;

/**
 * @author ironion
 * @date 2022/6/25 12:19
 */
public interface ComputePartVisitor {

    void visit(Computer computer);

    void visit(Keyboard keyboard);

    void visit(Mouse mouse);

    void visit(Monitor monitor);
}
