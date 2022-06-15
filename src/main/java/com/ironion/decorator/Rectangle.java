package com.ironion.decorator;

/**
 * @author ironion
 * @date 2022/6/13 10:40
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("rectangle");
    }
}
