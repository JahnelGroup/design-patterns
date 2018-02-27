package com.jahnelgroup.sandwichbuilder;

import com.jahnelgroup.sandwich.Sandwich;

/*
 * Defines what a builder needs to do in order to build a sandwich.
 * 
 */
public interface SandwichBuilder {

    public void addBread();
    
    public void addMeat();
    
    public void addVegetable();
    
    public void addCondiment();
    
    public Sandwich getSandwich();
    
}
