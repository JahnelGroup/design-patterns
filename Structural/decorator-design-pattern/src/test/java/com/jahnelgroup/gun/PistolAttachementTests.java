package com.jahnelgroup.gun;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.jahnelgroup.attachments.RedDotScopeAttachment;
import com.jahnelgroup.attachments.SilencerAttachement;

public class PistolAttachementTests {
    
    @Test
    public void shouldTestThatPistolStatHaveNotBeenAlteredWhenNothingIsAttachedToIt() {
        Gun pistol = new Pistol();
        assertTrue(pistol.aim() == .60);
        assertTrue(pistol.shoot() == 150.00);
    }
    
    @Test
    public void shouldTestThatAddingRedDotAttachmentIncreasesAccuracy() {
        Gun scopedPistol = new RedDotScopeAttachment(new Pistol());
        assertTrue(scopedPistol.aim() == .80);
    }
    
    @Test
    public void shouldTestThatAddingSilencerAttachmentDecreasesSoundPressure() {
        Gun silencedPistol = new SilencerAttachement(new Pistol());
        assertTrue(silencedPistol.shoot() == 120.00);
    }
    
    @Test
    public void shouldTestAbilityToAddMultipleDecoratorsAtTheSameTime() {
        Gun scopedSilencedPistol = new RedDotScopeAttachment(new SilencerAttachement(new Pistol()));
        assertTrue(scopedSilencedPistol.aim() == .80);
        assertTrue(scopedSilencedPistol.shoot() == 120.00);
    }

}
