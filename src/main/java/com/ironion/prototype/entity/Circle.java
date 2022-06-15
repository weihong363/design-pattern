package com.ironion.prototype.entity;

/**
 * @author ironion
 * @date 2022/6/13 17:12
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("circle");
    }
}
