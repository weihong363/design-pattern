package com.ironion.template;

/**
 * @author ironion
 * @date 2022/6/25 12:06
 */
public class Cricket extends Game {
    @Override
    public void initialize() {
        System.out.println("Cricket game initialized,starting ...");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket game started,enjoy ur game");
    }

    @Override
    public void endPlay() {
        System.out.println("Cricket game finished,bye bye~!");
    }
}
