package com.jahnelgroup.employee;

import com.jahnelgroup.sandwich.Sandwich;
import com.jahnelgroup.sandwichbuilder.SandwichBuilder;

/*
 * The Employee is the Director in the Builder Design pattern. 
 * It uses the builders to build the sandwich the customer wants
 * 
 */
public class Employee {

    /*
     * Builder Employee will use to make a sandwich
     * 
     */
    private SandwichBuilder builder;
    
    public Employee(SandwichBuilder builder) {
        this.builder = builder;
    }
    
    /*
     * This is the construct method that creates the sandwich using the methods provided by the builder interface.
     * 
     */
    public void makeSandwich() { 
        this.builder.addBread();
        this.builder.addMeat();
        this.builder.addVegetable();
        this.builder.addCondiment();
    }
    
    /*
     * Get the final created Product from the builder.
     * 
     */
    public Sandwich getSandwich() {
        return this.builder.getSandwich();
    }
    
}
