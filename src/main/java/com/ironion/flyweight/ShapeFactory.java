package com.ironion.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author ironion
 * @date 2022/6/16 11:50
 */
public class ShapeFactory {

    private static final Map<String, Circle> shapeMap = new HashMap<>();

    public static Shape getCircle(String color){
        Circle circle = shapeMap.get(color);
        if (Objects.isNull(circle)){
            circle = new Circle(color);
            shapeMap.put(color, circle);
        }
        return circle;
    }
}
