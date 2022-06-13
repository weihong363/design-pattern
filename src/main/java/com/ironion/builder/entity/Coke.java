package com.ironion.builder.entity;

/**
 * @author ironion
 * @date 2022/6/13 16:07
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 5.3f;
    }
}
