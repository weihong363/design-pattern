package com.ironion.chainofresposibility;

/**
 * @author ironion
 * @date 2022/6/16 15:21
 */
public class ChainPatternDemo {

    /**
     * 构造一个责任链
     *
     * @return
     */
    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(LogConstants.ERROR);
        AbstractLogger fileLogger = new FileLogger(LogConstants.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(LogConstants.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger abstractLogger = getChainOfLoggers();
        abstractLogger.logMessage(LogConstants.INFO, "info log ...");
        abstractLogger.logMessage(LogConstants.DEBUG, "debug log ...");
        abstractLogger.logMessage(LogConstants.ERROR, "error log ...");
    }
}
