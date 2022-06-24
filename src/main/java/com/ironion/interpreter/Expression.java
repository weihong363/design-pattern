package com.ironion.interpreter;

/**
 * @author ironion
 * @date 2022/6/17 16:10
 */
public interface Expression {

    boolean interpret(String context);
}
