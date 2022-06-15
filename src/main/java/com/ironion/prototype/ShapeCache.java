package com.ironion.prototype;

import com.ironion.prototype.entity.Circle;
import com.ironion.prototype.entity.Rectangle;
import com.ironion.prototype.entity.Shape;
import com.ironion.prototype.entity.Square;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ironion
 * @date 2022/6/13 17:33
 */
public class ShapeCache {
    private Map<String, Shape> shapeMap = new HashMap<>();

    Shape getShape(String shapeId){
        Shape shape = shapeMap.get(shapeId);
        return (Shape) shape.clone();
    }

    void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);
        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);
        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
