package com.jahnelgroup.videoplayer;

/*
 * The Mp4 class implements the VideoPlayer interface. 
 * This is an example of a class who does not need to be adapted since it already implements the main interface needed.
 * 
 */
public class Mp4 implements VideoPlayer {

    @Override
    public String playVideo(String videoName) {
        return "Playing MP4: " + videoName;
    }

}
