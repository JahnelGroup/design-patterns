package com.jahnelgroup.employee;

import com.jahnelgroup.customer.Customer;
import com.jahnelgroup.sandwich.Ingredient;
import com.jahnelgroup.sandwich.Sandwich;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class EmployeeTests {

    /*
     * Test that the correct sandwiches are being created based on what ingredients the director(Employee) is given.
     * 
     */

    @Test
    public void shouldCreateSandwichCorrectly() {
        Employee e = new Employee("Victor");
        Customer c = new Customer(new Ingredient("B", "seed"),
                                    new Ingredient("M", "ham"),
                                    new Ingredient("M", "turkey"),
                                    new Ingredient("V", "lettuce"),
                                    new Ingredient("C", "mustard"));
        Sandwich s = e.makeOrder(c);
        assertThat(s.getSandwichIngredients())
                .usingElementComparatorOnFields("type", "val")
                .containsExactly(
                        new Ingredient("B", "seed"),
                        new Ingredient("M", "ham"),
                        new Ingredient("M", "turkey"),
                        new Ingredient("V", "lettuce"),
                        new Ingredient("C", "mustard"),
                        new Ingredient("B", "seed"));
    }

    @Test
    public void shouldCreateSandwichWithoutMeat() {
        Employee e = new Employee("Victor");
        Customer c = new Customer(
                new Ingredient("B", "seed"),
                new Ingredient("V", "tomato"),
                new Ingredient("V", "lettuce"),
                new Ingredient("C", "mustard"));
        Sandwich s = e.makeOrder(c);
        assertThat(s.getSandwichIngredients())
                .usingElementComparatorOnFields("type", "val")
                .containsExactly(
                        new Ingredient("B", "seed"),
                        new Ingredient("V", "tomato"),
                        new Ingredient("V", "lettuce"),
                        new Ingredient("C", "mustard"),
                        new Ingredient("B", "seed"));
    }

    @Test
    public void shouldCreateSandwichWithoutBread(){
        Employee e = new Employee("Victor");
        Customer c = new Customer(
                new Ingredient("V", "tomato"),
                new Ingredient("V", "lettuce"),
                new Ingredient("C", "mustard"));
        Sandwich s = e.makeOrder(c);
        assertThat(s.getSandwichIngredients())
                .usingElementComparatorOnFields("type", "val")
                .containsExactly(
                        new Ingredient("V", "tomato"),
                        new Ingredient("V", "lettuce"),
                        new Ingredient("C", "mustard"));
    }

}
