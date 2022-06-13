package com.ironion.abstractfactory.service.impl;

import com.ironion.abstractfactory.service.Color;

/**
 * @author ironion
 * @date 2022/6/13 11:14
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("fill in with blue");
    }
}
