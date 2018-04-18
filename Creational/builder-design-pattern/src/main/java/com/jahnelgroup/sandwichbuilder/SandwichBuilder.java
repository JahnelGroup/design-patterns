package com.jahnelgroup.sandwichbuilder;

import com.jahnelgroup.sandwich.Ingredient;
import com.jahnelgroup.sandwich.Sandwich;

/*
 * Defines what a builder needs to do in order to build a sandwich.
 * 
 */
public interface SandwichBuilder {

    SandwichBuilder bread(Ingredient bread);
    
    SandwichBuilder meat(Ingredient meat);
    
    SandwichBuilder veg(Ingredient veg);
    
    SandwichBuilder cond(Ingredient cond);
    
    Sandwich build();
    
}
