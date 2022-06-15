package com.ironion.bridge;

import java.awt.Shape;

/**
 * @author ironion
 * @date 2022/6/14 18:18
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Circle red = new Circle(1, 2, 3, new RedCircle());
        Circle green = new Circle(1, 2, 3, new GreenCircle());
        red.draw();
        green.draw();
    }
}
