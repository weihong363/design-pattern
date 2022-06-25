package com.ironion.visitor;

/**
 * @author ironion
 * @date 2022/6/25 12:19
 */
public class Keyboard implements ComputePart {
    @Override
    public void accept(ComputePartVisitor computePartVisitor) {
        computePartVisitor.visit(this);
    }
}
