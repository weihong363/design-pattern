package com.ironion.singleton;

/**
 * 饿汉式
 *
 * @author ironion
 * @date 2022/6/13 11:44
 */
public class Hungry {

    private static Hungry instance = new Hungry();

    private Hungry(){

    }

    public static Hungry getInstance() {
        return instance;
    }

    public void hello(){
        System.out.println("Hello World!");
    }
}
