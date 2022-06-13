package com.ironion.builder.entity;

/**
 * @author ironion
 * @date 2022/6/13 16:04
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
