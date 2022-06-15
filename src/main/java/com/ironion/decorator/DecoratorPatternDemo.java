package com.ironion.decorator;

/**
 * @author ironion
 * @date 2022/6/15 17:17
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Circle circle = new Circle();
        ShapeDecorator shapeDecorator = new RedShapeDecorator(circle);
        System.out.println("normal:");
        circle.draw();
        System.out.println("decorated border:");
        shapeDecorator.draw();

        //other shape
        ShapeDecorator rectangleDecorator = new RedShapeDecorator(new Rectangle());
        System.out.println("decorated border:");
        rectangleDecorator.draw();
    }
}
