package com.jahnelgroup.receipt;

import com.jahnelgroup.order.Order;

/*
    This interface defines the Facade object that the client will interact with in com.jahnelgroup.order to use the subsystem.
    There are two methods that allow the user to interact with the subsystem in different ways.
 */
public interface Receipt {

    Order getTotalOnlineOrder(Order order);

    Order getTotalInStoreOrder(Order order);

}
