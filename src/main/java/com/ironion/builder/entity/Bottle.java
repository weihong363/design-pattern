package com.ironion.builder.entity;

/**
 * @author ironion
 * @date 2022/6/13 15:58
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "bottle";
    }
}
