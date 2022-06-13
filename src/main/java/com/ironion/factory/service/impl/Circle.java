package com.ironion.factory.service.impl;

import com.ironion.factory.service.Shape;

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
