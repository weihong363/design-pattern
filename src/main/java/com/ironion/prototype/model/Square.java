package com.ironion.prototype.model;

/**
 * @author ironion
 * @date 2022/6/13 17:32
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("square");
    }
}
