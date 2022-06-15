package com.ironion.adapter;

/**
 * @author ironion
 * @date 2022/6/14 10:31
 */
public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType) {
        String type = audioType.toLowerCase();
        switch (type){
            case "mp3":
                System.out.println("play mp3!");
                break;
            case "mp4":
            case "vlc":
                mediaAdapter = new MediaAdapter(type);
                mediaAdapter.play(type);
                break;
            default:
                System.out.println("invalid audio type!");
                break;
        }
    }
}
