package com.ironion.factory;

/**
 * @author ironion
 * @date 2022/6/13 10:41
 */
public class ShapeFactory {

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
}
