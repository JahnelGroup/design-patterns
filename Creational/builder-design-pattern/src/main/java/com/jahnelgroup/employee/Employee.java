package com.jahnelgroup.employee;

import com.jahnelgroup.customer.Customer;
import com.jahnelgroup.sandwich.Sandwich;
import com.jahnelgroup.sandwichbuilder.PrepStation;
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
    private SandwichBuilder builder = new PrepStation();
    private String name;
    
    public Employee(String name) {
        this.name = name;
    }
    
    /*
     * This is the construct method that creates the sandwich using the methods provided by the builder interface.
     * Sandwich will be returned after created
     */
    public Sandwich makeOrder(Customer cust) {
        cust.getIngredients()
                .stream()
                .forEach(i -> {
                    switch(i.getType()){
                        case "B": builder.bread(i);  break;
                        case "M": builder.meat(i);   break;
                        case "V": builder.veg(i);    break;
                        case "C": builder.cond(i);   break;
                    }
                });
        return builder.build();
    }
    
}
