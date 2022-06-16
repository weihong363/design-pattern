package com.ironion.proxy;

import java.util.Objects;

/**
 * @author ironion
 * @date 2022/6/16 14:27
 */
public class ProxyImage implements Image {

    private String fileName;

    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (Objects.isNull(realImage)){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
