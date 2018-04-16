package com.jahnelgroup.attachments;

import com.jahnelgroup.gun.Gun;

/*
 * This class adds responsibility to Gun objects and decreases the gun's sound pressure.
 * 
 */
public class SilencerAttachement extends Attachment {

    private double muffle = 30.0;
    
    public SilencerAttachement(Gun gun) {
        super(gun);
    }

    /*
     * This attachment does not alter the aim of the gun so it only calls the gun's aim method.
     * 
     */
    @Override
    public double aim() {
        return super.gun.aim();
    }

    /*
     * Adds new functionality to Gun object by decreasing the gun's sound pressure.
     * 
     */
    @Override
    public double shoot() {
        return super.gun.shoot() - this.muffle;
    }

}
