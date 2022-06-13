package com.ironion.builder.entity;

/**
 * @author ironion
 * @date 2022/6/13 16:05
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 10.2f;
    }
}
