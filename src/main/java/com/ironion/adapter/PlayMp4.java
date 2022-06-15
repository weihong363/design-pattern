package com.ironion.adapter;

import com.ironion.adapter.AdvancedMediaPlayer;

/**
 * @author ironion
 * @date 2022/6/14 10:26
 */
public class PlayMp4 implements AdvancedMediaPlayer {
    @Override
    public void playVlc() {

    }

    @Override
    public void playMp4() {
        System.out.println("play mp4!");
    }
}
