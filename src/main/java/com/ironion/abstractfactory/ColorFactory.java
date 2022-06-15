package com.ironion.abstractfactory;

import com.ironion.factory.Shape;

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
