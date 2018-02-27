package com.jahnelgroup.sandwich;

public class Sandwich implements SandwichPlan {

    private String bread;
    private String meat;
    private String vegetable;
    private String condiment;
    
    @Override
    public void setBread(String bread) {
        this.bread = bread; 
    }

    @Override
    public void setMeat(String meat) {
        this.meat = meat;
    }

    @Override
    public void setVegetable(String vegetable) {
        this.vegetable = vegetable;
    }

    @Override
    public void setCondiment(String condiment) {
        this.condiment = condiment;
    }
    
    /*
     * The Getter methods below are being used for testing. This is not necessary for the Builder Design Pattern
     * 
     */

    public String getBread() {
        return this.bread;
    }
    
    public String getMeat() {
        return this.meat;
    }
    
    public String getVegetable() {
        return this.vegetable;
    }
    
    public String getCondiment() {
        return this.condiment;
    }

}
