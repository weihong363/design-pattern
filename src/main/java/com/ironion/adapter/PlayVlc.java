package com.ironion.adapter;

import com.ironion.adapter.AdvancedMediaPlayer;

/**
 * @author ironion
 * @date 2022/6/14 10:26
 */
public class PlayVlc implements AdvancedMediaPlayer {
    @Override
    public void playVlc() {
        System.out.println("play vlc!");
    }

    @Override
    public void playMp4() {

    }
}
