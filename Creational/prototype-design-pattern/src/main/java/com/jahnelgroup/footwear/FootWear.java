package com.jahnelgroup.footwear;

/*
 * FootWear is the abstract Prototype that clones itself. 
 * It implements the Cloneable interface to utilize Object's clone method. 
 * 
 */
public abstract class FootWear implements Cloneable {

    protected Long id;
    protected String type;
    protected String seasonToWear;
    protected String color;     
    
    public Long getId() {
        return this.id;
    }
    
    public String getType() {
        return this.type;
    }
    
    public String getSeasonToWear() {
        return this.seasonToWear;
    }
    
    public String getColor() {
        return this.color;
    }
    
    /*
     * In the clone method, we are cloning the super class and returning it back.
     * This is the code is crucial for the Prototype Design Pattern
     * 
     */
    public FootWear clone() {
        String className = getClass().getSimpleName();
        if(className.equals(Boots.class.getSimpleName())) {
            return new Boots(getId(), getColor());
        }
        else if(className.equals(Sneakers.class.getSimpleName())) {
            return new Sneakers(getId(), getColor());
        }
        else if(className.equals(FlipFlops.class.getSimpleName())) {
            return new FlipFlops(getId(), getColor());
        }
        else {
            throw new RuntimeException("Footwear does not exist.");
        }
    }
    
}
