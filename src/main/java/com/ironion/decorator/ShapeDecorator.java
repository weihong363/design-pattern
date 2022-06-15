package com.ironion.decorator;

/**
 * @author ironion
 * @date 2022/6/15 15:57
 */
public class ShapeDecorator implements Shape {

    Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
