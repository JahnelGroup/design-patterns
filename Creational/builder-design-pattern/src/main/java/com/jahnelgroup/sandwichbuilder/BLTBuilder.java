package com.jahnelgroup.sandwichbuilder;

import com.jahnelgroup.sandwich.Sandwich;

/*
 * BLTBuilder builds a sandwich with data specific to a BLT sandwich.
 * 
 */
public class BLTBuilder implements SandwichBuilder {
    
    private Sandwich blt;
    
    public BLTBuilder() {
        this.blt = new Sandwich();
    }
    
    @Override
    public void addBread() {
        this.blt.setBread("White Bread");
    }

    @Override
    public void addMeat() {
        this.blt.setMeat("Bacon.");
    }

    @Override
    public void addVegetable() {
        this.blt.setVegetable("Lettuce & Tomato");
    }

    @Override
    public void addCondiment() {
        this.blt.setCondiment("Mayonaise");
    }

    @Override
    public Sandwich getSandwich() {
        return this.blt;
    }

}
