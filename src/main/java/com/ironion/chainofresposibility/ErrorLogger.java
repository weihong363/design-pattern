package com.ironion.chainofresposibility;

/**
 * @author ironion
 * @date 2022/6/16 15:19
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println(String.format("error logger : %s", message));
    }
}
