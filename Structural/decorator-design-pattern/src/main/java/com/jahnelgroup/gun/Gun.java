package com.jahnelgroup.gun;

/*
 * This interface defines objects that can have responsibilities added to them dynamically.
 * 
 */
public interface Gun {
    /*
     * Returns accuracy percentage with gun.
     * 
     */
    public double aim();
    
    /*
     * Return the rough sound level in decibels (dB) done by gun.
     * 
     */
    public double shoot();
    
}
