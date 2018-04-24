package com.jahnelgroup.order;

import java.math.BigDecimal;

public class OnlineOrder extends Order {

    //Used to calculate shipping
    private String itemStateLocation;
    //Used to calculate shipping
    private String customerStateLocation;
    //Used to store shippingCost
    private BigDecimal shippingCost;

    public OnlineOrder(Long orderId, BigDecimal basePrice, double coupon, String itemStateLocation, String customerStateLocation) {
        super(orderId, basePrice, coupon);
        this.itemStateLocation = itemStateLocation;
        this.customerStateLocation = customerStateLocation;
    }

    public String getItemStateLocation() {
        return this.itemStateLocation;
    }

    public String getCustomerStateLocation() {
        return this.customerStateLocation;
    }

    public void setShippingCost(BigDecimal shippingCost) {
        this.shippingCost = shippingCost;
    }

    public BigDecimal getShippingCost() {
        return this.shippingCost;
    }

}
