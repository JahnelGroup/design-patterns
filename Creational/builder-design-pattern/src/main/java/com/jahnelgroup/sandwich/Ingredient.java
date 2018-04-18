package com.jahnelgroup.sandwich;

/*
    This entity represents what a Sandwich is made up of.
 */
public class Ingredient {

    private String type;
    private String val;

    public Ingredient(String type, String val){
        this.type = type;
        this.val = val;
    }

    public String getType(){
        return this.type;
    }

    public String getVal(){
        return this.val;
    }

}
