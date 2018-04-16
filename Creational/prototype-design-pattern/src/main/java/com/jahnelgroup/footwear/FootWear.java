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
    
    /*
     * In the clone method, we are cloning the super class and returning it back.
     * This is the code is crucial for the Prototype Design Pattern
     * (non-Javadoc)
     * @see java.lang.Object#clone()
     */
    public FootWear clone() {
        FootWear clone = null;
        
        try {
            clone = (FootWear) super.clone();
        } catch(CloneNotSupportedException ex) {
            throw new RuntimeException("Footwear does not exist.");
        }
        return clone;
    }
}
