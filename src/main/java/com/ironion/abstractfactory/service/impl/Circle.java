package com.ironion.abstractfactory.service.impl;

import com.ironion.abstractfactory.service.Shape;

/**
 * @author ironion
 * @date 2022/6/13 10:38
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("circle");
    }
}