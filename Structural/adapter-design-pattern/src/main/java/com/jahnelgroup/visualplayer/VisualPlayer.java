package com.jahnelgroup.visualplayer;

/*
 * The VisualPlayer interface is the outside interface in this example.
 * We want an adapter to be able to play VisualPlayer entities in the same place we would play VideoPlayer entities.
 * 
 */
public interface VisualPlayer {

    String playVisual(String visualName);
    
}
