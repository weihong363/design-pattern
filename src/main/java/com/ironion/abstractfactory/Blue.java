package com.ironion.abstractfactory;

import com.ironion.abstractfactory.Color;

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
