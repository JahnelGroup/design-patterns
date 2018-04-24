package com.jahnelgroup.ordersubsystem;

import com.jahnelgroup.order.Order;

/*
    This interface defines the objects that can alter the com.jahnelgroup.order object in context.

 */
public interface PurchaseComponent {

    // This method updated the com.jahnelgroup.order in context to the class that implements this interface.
    Order updateOrder(Order order);

}
