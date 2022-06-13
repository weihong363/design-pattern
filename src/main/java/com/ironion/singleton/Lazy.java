package com.ironion.singleton;

/**
 * 懒汉式
 *
 * @author ironion
 * @date 2022/6/13 11:44
 */
public class Lazy {

    private static Lazy instance;

    private Lazy(){

    }

    public static Lazy getInstance() {
        if (null == instance){
            instance = new Lazy();
        }
        return instance;
    }

    public void hello(){
        System.out.println("Hello World!");
    }
}
