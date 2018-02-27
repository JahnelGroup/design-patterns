package com.jahnelgroup.phone;

import java.math.BigDecimal;

/*
 * This concrete class is being returned from the factory method when using the SamsungFactory subclass.
 * 
 */
public class SamsungPhone implements Phone {

    public String getName() {
        return "Samsung Phone";
    }

    public BigDecimal getPrice() {
        return BigDecimal.valueOf(725.00);
    }

}
