package com.jahnelgroup.ordersubsystem;

import com.jahnelgroup.order.OnlineOrder;
import com.jahnelgroup.order.Order;

import java.math.BigDecimal;

public class OrderShipping implements PurchaseComponent {

    @Override
    public Order updateOrder(Order order) {
        OnlineOrder onlineOrder = (OnlineOrder) order;
        // If customer is in the same state as the item, then shipping will be $3.00, else $7.00.
        onlineOrder.setShippingCost(onlineOrder.getCustomerStateLocation().equals(onlineOrder.getItemStateLocation())
                ? BigDecimal.valueOf(3.00)
                : BigDecimal.valueOf(7.00));
        onlineOrder.addToFinalPrice(onlineOrder.getShippingCost());
        return onlineOrder;
    }
}
