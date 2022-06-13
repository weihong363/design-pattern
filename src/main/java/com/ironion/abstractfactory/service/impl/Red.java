package com.ironion.abstractfactory.service.impl;

import com.ironion.abstractfactory.service.Color;

/**
 * @author ironion
 * @date 2022/6/13 11:13
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("fill in with red");
    }
}
