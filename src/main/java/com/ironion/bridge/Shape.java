package com.ironion.bridge;

/**
 * @author ironion
 * @date 2022/6/14 18:08
 */
public abstract class Shape {

    DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    abstract void draw();
}
