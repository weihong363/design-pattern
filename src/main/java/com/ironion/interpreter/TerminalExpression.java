package com.ironion.interpreter;

/**
 * @author ironion
 * @date 2022/6/17 16:13
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
