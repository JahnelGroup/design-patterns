package com.jahnelgroup.attachments;

import com.jahnelgroup.gun.Gun;

/*
 * This class adds responsibility to Gun objects and increases the accuracy.
 * 
 */
public class RedDotScopeAttachment extends Attachment {
    
    /*
     * This variable determines how much the attachment increases the gun's accuracy.
     * 
     */
    private double precision = .20;

    public RedDotScopeAttachment(Gun gun) {
        super(gun);
    }

    /*
     * Adds new functionality to Gun object by increasing the output of the gun's accuracy.
     * 
     */
    @Override
    public double aim() {
        return super.gun.aim() + this.precision;
    }

    /*
     * This attachment does not alter the gun's shooting so it only calls the gun's shoot method.
     * 
     */
    @Override
    public double shoot() {
        return super.gun.shoot();
    }

}
