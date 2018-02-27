package com.jahnelgroup.employee;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.jahnelgroup.sandwich.Sandwich;
import com.jahnelgroup.sandwichbuilder.BLTBuilder;
import com.jahnelgroup.sandwichbuilder.BurgerBuilder;

public class EmployeeTests {

    /*
     * Test that the correct sandwiches are being created based on what builder the director(Employee) is given.
     * 
     */
    @Test
    public void shouldReturnABurgerWhenEmployeeIsGivenABurgerBuilder() {
        Employee e = new Employee(new BurgerBuilder());
        e.makeSandwich();
        wasCorrectSandwichCreated(e.getSandwich(), "Bun", "Beef", "Lettuce", "Ketchup");
    }
    
    @Test
    public void shouldReturnABLTWhenEmployeeIsGivenABLTBuilder() {
        Employee e = new Employee(new BLTBuilder());
        e.makeSandwich();
        wasCorrectSandwichCreated(e.getSandwich(), "White Bread", "Bacon.", "Lettuce & Tomato", "Mayonaise");
    }
    
    private void wasCorrectSandwichCreated(Sandwich sandwich, String bread, String meat, String vegetable, String condiment) {
        assertTrue(sandwich.getBread().equals(bread));
        assertTrue(sandwich.getMeat().equals(meat));
        assertTrue(sandwich.getVegetable().equals(vegetable));
        assertTrue(sandwich.getCondiment().equals(condiment));
    }

}
