package com.ironion.builder.entity;

/**
 * @author ironion
 * @date 2022/6/13 16:05
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 15.5f;
    }
}
