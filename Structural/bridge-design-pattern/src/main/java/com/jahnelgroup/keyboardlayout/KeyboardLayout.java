package com.jahnelgroup.keyboardlayout;

import com.jahnelgroup.keyboard.Keyboard;

/*
 * KeyboardLayout is the abstraction class that uses the interface.
 * The classes that extend this class will not effect the Keyboard interface if they needed to be changed.
 * 
 */
public abstract class KeyboardLayout {

    /*
     * Interface we are making a bridge from.
     * 
     */
    Keyboard keyboard;
    
    public KeyboardLayout(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
    
    public abstract String keyPressed(String key);
    
}
