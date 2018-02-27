package com.jahnelgroup.phone;

import java.math.BigDecimal;

/*
 * This concrete class is being returned from the factory method when using the AppleFactory subclass.
 * 
 */
public class ApplePhone implements Phone {

    public String getName() {
        return "Apple Phone";
    }

    public BigDecimal getPrice() {
        return BigDecimal.valueOf(800.0);
    }

}
