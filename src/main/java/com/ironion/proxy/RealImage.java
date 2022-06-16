package com.ironion.proxy;

/**
 * @author ironion
 * @date 2022/6/16 14:27
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    public void loadFromDisk(){
        System.out.println(String.format("load file「%s」 from disk ...", fileName));
    }

    @Override
    public void display() {
        System.out.println(String.format("display image, file「%s」", fileName));
    }
}
