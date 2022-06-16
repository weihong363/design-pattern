package com.ironion.flyweight;

import com.ironion.bridge.DrawAPI;

/**
 * @author ironion
 * @date 2022/6/14 18:11
 */
public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(String.format("%s circle: %d %d %s",color,x,y,radius));
    }
}
