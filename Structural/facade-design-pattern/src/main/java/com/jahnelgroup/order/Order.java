package com.jahnelgroup.order;

import java.math.BigDecimal;

public abstract class Order {

    //Unique identifier for com.jahnelgroup.order.
    private Long orderId;
    // Contains the starting base price of the item.
    private BigDecimal basePrice;
    // Contains the final price of the com.jahnelgroup.order
    private BigDecimal finalPrice = BigDecimal.ZERO;
    //Contain percent of coupon applied
    private double coupon = 0.0;

    public Order(Long orderId, BigDecimal basePrice, double coupon){
        this.orderId = orderId;
        this.basePrice = basePrice;
        this.finalPrice = basePrice;
        this.coupon = coupon;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public BigDecimal getBasePrice() {
        return this.basePrice;
    }

    public BigDecimal getFinalPrice() {
        return this.finalPrice.stripTrailingZeros();
    }

    // Method adds to final price
    public void addToFinalPrice(BigDecimal amount) {
        this.finalPrice = this.finalPrice.add(amount);
    }

    // Method substracts from final price
    public void subFromFinalPrice(BigDecimal amount) {
        this.finalPrice = this.finalPrice.subtract(amount);
    }

    public double getCoupon() {
        return this.coupon;
    }

}
