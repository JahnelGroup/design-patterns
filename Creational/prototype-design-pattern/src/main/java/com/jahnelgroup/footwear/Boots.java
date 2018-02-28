package com.jahnelgroup.footwear;

/*
 * Boots is one of the Concrete Prototypes that extend the Abstract Prototype, FootWear.
 * 
 */
public class Boots extends FootWear {

    public Boots(Long id, String color) {
        super.id = id;
        super.type = "Boots";
        super.seasonToWear = "Winter";
        this.color = color;
    }
}
