package com.ironion.singleton;

/**
 * 懒汉式（线程安全）
 *
 * @author ironion
 * @date 2022/6/13 11:44
 */
public class SyncLazy {

    private static SyncLazy instance;

    private SyncLazy(){

    }

    public static synchronized SyncLazy getInstance() {
        if (null == instance){
            instance = new SyncLazy();
        }
        return instance;
    }

    public void hello(){
        System.out.println("Hello World!");
    }
}
