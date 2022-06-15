package com.ironion.abstractfactory;

import com.ironion.factory.Shape;

/**
 * @author ironion
 * @date 2022/6/13 11:17
 */
public abstract class AbstractFactory {

    /**
     * get type
     *
     * @param type shape type
     */
    public abstract Shape getShape(String type);

    /**
     * get type
     *
     * @param type color type
     */
    public abstract Color getColor(String type);
}
