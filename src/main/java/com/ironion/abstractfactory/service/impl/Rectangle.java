package com.ironion.abstractfactory.service.impl;

import com.ironion.abstractfactory.service.Shape;

/**
 * @author ironion
 * @date 2022/6/13 10:40
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("rectangle");
    }
}
