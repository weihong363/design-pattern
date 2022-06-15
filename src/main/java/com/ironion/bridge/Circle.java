package com.ironion.bridge;

/**
 * @author ironion
 * @date 2022/6/14 18:11
 */
public class Circle extends Shape {
    private int x;
    private int y;
    private int radius;
    public Circle(int x, int y, int radius,DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    void draw() {
        drawAPI.drawCircle(x, y, radius);
    }
}
