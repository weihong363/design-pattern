package com.ironion.abstractfactory;

import com.ironion.abstractfactory.service.Color;
import com.ironion.factory.ShapeFactory;
import com.ironion.factory.service.Shape;

/**
 * @author ironion
 * @date 2022/6/13 10:48
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getAbstractFactory("shape");
        AbstractFactory colorFactory = FactoryProducer.getAbstractFactory("color");

        Shape circle = shapeFactory.getShape("circle");
        Shape square = shapeFactory.getShape("square");

        Color red = colorFactory.getColor("red");
        Color blue = colorFactory.getColor("blue");

        circle.draw();
        blue.fill();

        square.draw();
        red.fill();

    }
}
