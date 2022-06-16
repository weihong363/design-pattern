package com.ironion.chainofresposibility;

import java.util.Objects;

/**
 * @author ironion
 * @date 2022/6/16 15:08
 */
public abstract class AbstractLogger {

    int level;

    AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        // 通过责任链把日志信息一级一级向上传递
        if(this.level <= level){
            write(message);
        }
        if (Objects.nonNull(nextLogger)){
            nextLogger.logMessage(level, message);
        }
    }

    abstract void write(String message);
}
