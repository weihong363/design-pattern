package com.ironion.proxy;

/**
 * @author ironion
 * @date 2022/6/16 14:34
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        // 这里实现的是静态代理
        ProxyImage image = new ProxyImage("File1");
        image.display();
    }
}
