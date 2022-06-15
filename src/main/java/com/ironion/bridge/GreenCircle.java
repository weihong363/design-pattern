package com.ironion.bridge;

/**
 * @author ironion
 * @date 2022/6/14 18:07
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println(String.format("green circle: %d %d %s",x,y,radius));
    }
}
