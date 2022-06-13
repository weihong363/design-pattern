package com.ironion.factory;

import com.ironion.factory.service.Shape;

/**
 * @author ironion
 * @date 2022/6/13 10:48
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape1 = factory.getShape("Circle");
        Shape shape2 = factory.getShape("Rectangle");
        Shape shape3 = factory.getShape("Square");
        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
