package com.ironion.visitor;

/**
 * @author ironion
 * @date 2022/6/25 12:18
 */
public interface ComputePart {

    void accept(ComputePartVisitor computePartVisitor);
}
