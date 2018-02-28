package com.jahnelgroup.footwear;

/*
 * FlipFlops is one of the Concrete Prototypes that extend the Abstract Prototype, FootWear.
 * 
 */
public class FlipFlops extends FootWear {

    public FlipFlops(Long id, String color) {
        super.id = id;
        super.type = "Flip Flops";
        super.seasonToWear = "Summer";
        super.color = color;
    }
}
