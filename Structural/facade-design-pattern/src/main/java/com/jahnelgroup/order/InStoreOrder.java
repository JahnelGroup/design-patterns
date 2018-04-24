package com.jahnelgroup.order;

import java.math.BigDecimal;

public class InStoreOrder extends Order {

    public InStoreOrder(Long orderId, BigDecimal basePrice, double coupon) {
        super(orderId, basePrice, coupon);
    }

}
