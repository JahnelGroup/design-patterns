package com.jahnelgroup.keyboardlayout;

import com.jahnelgroup.keyboard.Keyboard;

/*
 * This one of the concrete classes that extend the abstract bridge.
 * 
 */
public class QwertyLayout extends KeyboardLayout {

    public QwertyLayout(Keyboard keyboard) {
        super(keyboard);
    }

    /*
     * Changing the behavior of this method would not interfere with the Keyboard interface.
     * 
     */
    @Override
    public String keyPressed(String key) {
        return "Qwerty " + keyboard.keyPress(key);
    }

}
