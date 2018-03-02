package com.jahnelgroup.keyboard;

/*
 * This class is a direct implementor of the Keyboard class. 
 * This class does not utilize the bridge design pattern.  
 * 
 */
public class MechanicalKeyboard implements Keyboard {

    @Override
    public String keyPress(String key) {
        return "Mechanical key pressed: " + key;
    }

}
