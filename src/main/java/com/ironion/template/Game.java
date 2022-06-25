package com.ironion.template;

/**
 * @author ironion
 * @date 2022/6/25 12:04
 */
public abstract class Game {

    public abstract void initialize();

    public abstract void startPlay();

    public abstract void endPlay();

    public void play(){
        initialize();
        startPlay();
        endPlay();
    }
}
