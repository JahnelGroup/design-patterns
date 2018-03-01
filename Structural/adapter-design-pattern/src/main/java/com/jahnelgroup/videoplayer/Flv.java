package com.jahnelgroup.videoplayer;

/*
 * The Flv class implements the VideoPlayer interface. 
 * This is an example of a class who does not need to be adapted since it already implements the main interface needed.
 * 
 */
public class Flv implements VideoPlayer {

    @Override
    public String playVideo(String videoName) {
        return "Playing FLV: " + videoName;
    }

}
