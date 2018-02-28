package com.jahnelgroup.footwear;

/*
 * Sneakers is one of the Concrete Prototypes that extend the Abstract Prototype, FootWear.
 * 
 */
public class Sneakers extends FootWear {
 
    public Sneakers(Long id, String color) {
        super.id = id;
        super.type = "Sneakers";
        super.seasonToWear = "Fall";
        super.color = color;
    }
    
}
