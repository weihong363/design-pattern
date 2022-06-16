package com.ironion.chainofresposibility;

/**
 * @author ironion
 * @date 2022/6/16 15:17
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println(String.format("console logger : %s", message));
    }
}
