package com.jahnelgroup.receipt;

import com.jahnelgroup.order.Order;
import com.jahnelgroup.ordersubsystem.OrderCoupon;
import com.jahnelgroup.ordersubsystem.OrderShipping;
import com.jahnelgroup.ordersubsystem.OrderTax;

public class OrderReceipt implements Receipt {

    /*
        Initialize all components of the subsystem.
     */
    private OrderTax orderTax = new OrderTax();
    private OrderShipping orderShipping = new OrderShipping();
    private OrderCoupon orderCoupon = new OrderCoupon();

    public OrderReceipt() { }

    /*
        This method contains
     */
    @Override
    public Order getTotalOnlineOrder(Order order) {
        order = orderCoupon.updateOrder(order);
        order = orderTax.updateOrder(order);
        order = orderShipping.updateOrder(order);
        return order;
    }

    @Override
    public Order getTotalInStoreOrder(Order order) {
        order = orderCoupon.updateOrder(order);
        order = orderTax.updateOrder(order);
        return order;
    }
}
