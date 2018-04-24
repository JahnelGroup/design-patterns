package com.jahnelgroup.ordersubsystem;

import com.jahnelgroup.order.Order;

import java.math.BigDecimal;

public class OrderTax implements PurchaseComponent {

    @Override
    public Order updateOrder(Order order) {
        order.addToFinalPrice(order.getFinalPrice().multiply(BigDecimal.valueOf(.08)));
        return order;
    }

}
