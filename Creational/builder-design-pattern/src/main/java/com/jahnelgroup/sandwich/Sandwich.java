package com.jahnelgroup.sandwich;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements SandwichPlan {

    /*
        List of ingredients that make the sandwich.
     */
    private List<Ingredient> ingredients = new ArrayList<>();

    /*
        Add ingredient to Sandwich's ingredient list.
     */
    @Override
    public void addLayer(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    /*
        Method is used for testing purposes.
     */
    public List<Ingredient> getSandwichIngredients(){
        return this.ingredients;
    }

}
