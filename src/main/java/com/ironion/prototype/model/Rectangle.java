package com.ironion.prototype.model;

/**
 * @author ironion
 * @date 2022/6/13 17:31
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("rectangle");
    }
}
