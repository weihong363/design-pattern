package com.ironion.visitor;

import java.util.Arrays;

/**
 * @author ironion
 * @date 2022/6/25 12:19
 */
public class Computer implements ComputePart {

    ComputePart[] parts;

    public Computer() {
        parts = new ComputePart[]{new Keyboard(), new Mouse(), new Monitor()};
    }

    @Override
    public void accept(ComputePartVisitor computePartVisitor) {
        Arrays.asList(parts).forEach(part -> part.accept(computePartVisitor));
        computePartVisitor.visit(this);
    }
}
