package com.ironion.chainofresposibility;

/**
 * @author ironion
 * @date 2022/6/16 15:17
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println(String.format("file logger : %s", message));
    }
}
