package com.ironion.singleton;

/**
 * 静态内部类
 *
 * @author ironion
 * @date 2022/6/13 11:44
 */
public class StaticInner {

    private static class SingletonHolder{
        private static final StaticInner INSTANCE = new StaticInner();
    }
    private static StaticInner instance = new StaticInner();

    private StaticInner(){

    }

    public static final StaticInner getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void hello(){
        System.out.println("Hello World!");
    }
}
