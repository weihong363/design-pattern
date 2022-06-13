package com.ironion.builder.entity;

/**
 * @author ironion
 * @date 2022/6/13 16:01
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
