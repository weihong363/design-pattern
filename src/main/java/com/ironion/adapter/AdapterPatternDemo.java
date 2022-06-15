package com.ironion.adapter;

/**
 * @author ironion
 * @date 2022/6/14 10:46
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("Mp3");
        audioPlayer.play("Mp4");
        audioPlayer.play("VLC");
        audioPlayer.play("pppDASDAS");
    }
}
