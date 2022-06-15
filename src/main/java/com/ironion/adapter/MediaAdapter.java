package com.ironion.adapter;

/**
 * @author ironion
 * @date 2022/6/14 10:29
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        switch (audioType.toLowerCase()){
            case "vlc":
                advancedMediaPlayer = new PlayVlc();
                break;
            case "mp4":
                advancedMediaPlayer = new PlayMp4();
                break;
            default:
                break;
        }
    }

    @Override
    public void play(String audioType) {
        switch (audioType.toLowerCase()){
            case "vlc":
                advancedMediaPlayer.playVlc();
                break;
            case "mp4":
                advancedMediaPlayer.playMp4();
                break;
            default:
                break;
        }
    }
}
