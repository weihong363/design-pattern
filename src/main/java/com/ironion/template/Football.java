package com.ironion.template;

/**
 * @author ironion
 * @date 2022/6/25 12:10
 */
public class Football extends Game {
    @Override
    public void initialize() {
        System.out.println("Football game initialized,starting ...");
    }

    @Override
    public void startPlay() {
        System.out.println("Football game started,enjoy ur game");
    }

    @Override
    public void endPlay() {
        System.out.println("Football game finished,bye bye~!");
    }
}
