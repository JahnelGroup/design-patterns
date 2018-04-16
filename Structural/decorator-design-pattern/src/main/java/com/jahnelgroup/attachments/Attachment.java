package com.jahnelgroup.attachments;

import com.jahnelgroup.gun.Gun;

public abstract class Attachment implements Gun {
    /*
     * Gun being decorated.
     * 
     */
    protected Gun gun;
    
    public Attachment(Gun gun) {
        this.gun = gun;
    }
    
}
