package com.ironion.command;

/**
 * @author ironion
 * @date 2022/6/16 19:06
 */
public class Stock {

    private String name = "name";

    private int quality = 100;

    void buy(){
        System.out.println(String.format("buy name:%s quality:%d",name,quality));
    }

    void sell(){
        System.out.println(String.format("sell name:%s quality:%d",name,quality));
    }
}
