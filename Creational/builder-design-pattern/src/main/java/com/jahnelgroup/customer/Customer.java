package com.jahnelgroup.customer;

import com.jahnelgroup.sandwich.Ingredient;

import java.util.Arrays;
import java.util.List;

public class Customer {

    private List<Ingredient> ingredients;

    public Customer(Ingredient ...ingredients){
        this.ingredients = Arrays.asList(ingredients);
    }

    public List<Ingredient> getIngredients(){
        return this.ingredients;
    }

}
