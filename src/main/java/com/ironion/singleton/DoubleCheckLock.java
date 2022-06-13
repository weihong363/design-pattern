package com.ironion.singleton;

/**
 * 双检锁
 *
 * @author ironion
 * @date 2022/6/13 11:44
 */
public class DoubleCheckLock {

    private static volatile DoubleCheckLock instance;

    private DoubleCheckLock(){

    }

    public static DoubleCheckLock getInstance() {
        if (null == instance){
            synchronized(DoubleCheckLock.class){
                if (null == instance) {
                    instance = new DoubleCheckLock();
                }
            }
        }
        return instance;
    }

    public void hello(){
        System.out.println("Hello World!");
    }
}
