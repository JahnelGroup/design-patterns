package com.jahnelgroup.visualplayer;

/*
 * Wmv is a class that will be compatible with the VideoPlayer interface due to the adapter.
 * 
 */
public class Wmv implements VisualPlayer {

    @Override
    public String playVisual(String visualName) {
        return "The WMV video " + visualName + " is playing.";
    }

}
