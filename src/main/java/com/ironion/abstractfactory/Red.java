package com.ironion.abstractfactory;

import com.ironion.abstractfactory.Color;

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
