package com.jahnelgroup.sandwichbuilder;

import com.jahnelgroup.sandwich.Sandwich;

/*
 * BurgerBuilder builds a sandwich with data specific to a burger.
 * 
 */
public class BurgerBuilder implements SandwichBuilder {

    private Sandwich burger;
    
    public BurgerBuilder() {
        this.burger = new Sandwich();
    }
    
    @Override
    public void addBread() {
        this.burger.setBread("Bun");
    }

    @Override
    public void addMeat() {
        this.burger.setMeat("Beef");
    }

    @Override
    public void addVegetable() {
        this.burger.setVegetable("Lettuce");
    }

    @Override
    public void addCondiment() {
        this.burger.setCondiment("Ketchup");
    }

    @Override
    public Sandwich getSandwich() {
        return this.burger;
    }
    
}
