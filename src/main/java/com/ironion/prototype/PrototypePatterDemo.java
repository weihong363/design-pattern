package com.ironion.prototype;

/**
 * @author ironion
 * @date 2022/6/13 17:49
 */
public class PrototypePatterDemo {

    public static void main(String[] args) {
        ShapeCache shapeCache = new ShapeCache();
        shapeCache.loadCache();
        System.out.println(shapeCache.getShape("1").getType());
        System.out.println(shapeCache.getShape("2").getType());
        System.out.println(shapeCache.getShape("3").getType());
    }
}
