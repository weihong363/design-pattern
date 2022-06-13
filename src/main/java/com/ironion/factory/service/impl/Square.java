package com.ironion.factory.service.impl;

import com.ironion.factory.service.Shape;

/**
 * @author ironion
 * @date 2022/6/13 10:39
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("square");
    }
}
