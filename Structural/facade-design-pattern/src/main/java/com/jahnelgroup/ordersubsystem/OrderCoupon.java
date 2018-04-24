package com.jahnelgroup.ordersubsystem;

import com.jahnelgroup.order.Order;

import java.math.BigDecimal;

public class OrderCoupon implements PurchaseComponent {

    @Override
    public Order updateOrder(Order order) {
        order.subFromFinalPrice(order.getFinalPrice().multiply(BigDecimal.valueOf(order.getCoupon())));
        return order;
    }
}
