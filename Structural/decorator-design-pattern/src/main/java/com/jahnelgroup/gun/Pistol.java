package com.jahnelgroup.gun;

/*
 * This class defines an object that responsibilities can be added to dynamically.
 * 
 */
public class Pistol implements Gun{

    protected double accuracy;
    
    protected double soundPressure;
    
    public Pistol() {
        accuracy = .60; //NOTE: make sure this doesn't screw anything up
        soundPressure = 150.0;
    }

    @Override
    public double aim() {
        return accuracy;
    }

    @Override
    public double shoot() {
        return soundPressure;
    }

}
