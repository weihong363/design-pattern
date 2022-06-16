package com.ironion.flyweight;

/**
 * @author ironion
 * @date 2022/6/16 11:56
 */
public class FlyWeightPatternDemo {

    static String[] colors = {"red","green","yellow","blue"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Circle circle = new Circle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100);
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
