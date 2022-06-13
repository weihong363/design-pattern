package com.ironion.abstractfactory;

import com.ironion.abstractfactory.service.Color;
import com.ironion.abstractfactory.service.impl.Blue;
import com.ironion.abstractfactory.service.impl.Green;
import com.ironion.abstractfactory.service.impl.Red;
import com.ironion.factory.service.Shape;
import com.ironion.factory.service.impl.Circle;
import com.ironion.factory.service.impl.Rectangle;
import com.ironion.factory.service.impl.Square;

/**
 * @author ironion
 * @date 2022/6/13 10:41
 */
public class ColorFactory extends AbstractFactory{

    @Override
    public Shape getShape(String type) {
        return null;
    }

    /**
     * get type
     *
     * @param type color type
     */
    public Color getColor(String type){
        Color color = null;
        switch (type.toLowerCase()){
            case "red":
                color = new Red();
                break;
            case "green":
                color = new Green();
                break;
            case "blue":
                color = new Blue();
                break;
            default:
                break;
        }
        return color;
    }
}
