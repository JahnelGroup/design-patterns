package com.jahnelgroup.footwearstore;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.jahnelgroup.footwear.FootWear;

/*
 * These tests test that the FootWearStore is able to clone and return the correct product.
 * 
 */
public class FootWearStoreTests {

    @Before
    public void setUp() {
        FootWearStore.loadInventory();
    }
    
    @Test
    public void shouldReturnACloneOfSneakers() {
        FootWear cloneSneakers = FootWearStore.getFootWear(1l);
        assertTrue(cloneSneakers.getType().equals("Sneakers"));
    }
    
    @Test
    public void shouldReturnACloneOfFlipFlops() {
        FootWear cloneSneakers = FootWearStore.getFootWear(2l);
        assertTrue(cloneSneakers.getType().equals("Flip Flops"));
    }
    
    @Test
    public void shouldReturnACloneOfBoots() {
        FootWear cloneSneakers = FootWearStore.getFootWear(3l);
        assertTrue(cloneSneakers.getType().equals("Boots"));
    }
    
    /*
     * Test to show that clones of FootWear are unique.
     * 
     */
    @Test
    public void shouldReturnFalseWhenSeeingIf2DifferentClonesAreEqual() {
        FootWear cloneSneakers = FootWearStore.getFootWear(1l);
        FootWear cloneSneakers2 = FootWearStore.getFootWear(1l);
        assertFalse(cloneSneakers.equals(cloneSneakers2));
        assertTrue(cloneSneakers.getType().equals("Sneakers"));
        assertTrue(cloneSneakers2.getType().equals("Sneakers"));
    }

}
