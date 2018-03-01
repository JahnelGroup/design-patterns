package com.jahnelgroup.formatadapter;

import com.jahnelgroup.videoplayer.VideoPlayer;
import com.jahnelgroup.visualplayer.VisualPlayer;

/*
 * FormatAdapter takes in a VisualPlayer interface and hides it behind the VideoPlayer interface.
 * 
 */
public class FormatAdapter implements VideoPlayer {

    /*
     * Interface that is not compatible with the VideoPlayer interace.
     * 
     */
    VisualPlayer visualFile; 
    
    public FormatAdapter(VisualPlayer visualFile) {
        this.visualFile = visualFile;
    }
    
    /*
     * The playVideo wraps the VisualPlayer's playVisual method.
     * 
     */
    @Override
    public String playVideo(String videoName) {
        return visualFile.playVisual(videoName);
    }

}
