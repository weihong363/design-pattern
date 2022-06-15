package com.ironion.abstractfactory;

import com.ironion.factory.Shape;
import com.ironion.factory.Circle;
import com.ironion.factory.Rectangle;
import com.ironion.factory.Square;

/**
 * @author ironion
 * @date 2022/6/13 10:41
 */
public class ShapeFactory extends AbstractFactory{

    /**
     * get type
     *
     * @param type shape type
     */
    public Shape getShape(String type){
        Shape shape = null;
        switch (type.toLowerCase()){
            case "circle":
                shape = new Circle();
                break;
            case "square":
                shape = new Square();
                break;
            case "rectangle":
                shape = new Rectangle();
                break;
            default:
                break;
        }
        return shape;
    }

    @Override
    public Color getColor(String type) {
        return null;
    }
}
