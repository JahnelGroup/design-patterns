package com.jahnelgroup.keyboardlayout;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.jahnelgroup.keyboard.LaptopKeyboard;
import com.jahnelgroup.keyboard.MechanicalKeyboard;

public class KeyboardLayoutTests {

    @Test
    public void shouldReturnStringOfKeyPressedOnMechanicalQwertyKeyboard() {
        KeyboardLayout keyboard = new QwertyLayout(new MechanicalKeyboard()); 
        assertTrue(keyboard.keyPressed("A").equals("Qwerty Mechanical key pressed: A"));
    }
    
    @Test
    public void shouldReturnStringOfKeyPressedOnKeyboardColemakKeyboard() {
        KeyboardLayout keyboard = new ColemakLayout(new LaptopKeyboard());
        assertTrue(keyboard.keyPressed("B").equals("Colemak Laptop key pressed: B"));
    }

}
