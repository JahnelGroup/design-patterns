package com.jahnelgroup.receipt;

import com.jahnelgroup.order.InStoreOrder;
import com.jahnelgroup.order.OnlineOrder;
import com.jahnelgroup.order.Order;
import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;


import java.math.BigDecimal;

/*
    The following tests show that the user is able to interact with the subsystem through the Facade object and get the results they would want.
    Instead of having to use each object within the Facade object, the client only has to call 1 method to get the desired functionality.
 */
public class OrderReceiptTests {

    Receipt orderReceipt;

    @Before
    public void setUp() {
        orderReceipt = new OrderReceipt();
    }

    @Test
    public void shouldProcessFinalSameStateOnlineOrderThroughFacadeObject() {
        Order onlineOrder = new OnlineOrder(1L, BigDecimal.valueOf(20.0), .10, "MA", "MA");
        onlineOrder = orderReceipt.getTotalOnlineOrder(onlineOrder);
        OnlineOrder expectedOrder = createExpectedOnlineOrder(1L, BigDecimal.valueOf(22.44), .10, "MA", "MA", BigDecimal.valueOf(3.00));
        assertThat(onlineOrder).isEqualToComparingOnlyGivenFields(expectedOrder, "orderId", "finalPrice", "shippingCost");
    }

    @Test
    public void shouldProcessFinalInStoreOrderThroughFacadeObject() {
        Order inStoreOrder = new InStoreOrder(1l, BigDecimal.valueOf(20.0), .10);
        inStoreOrder = orderReceipt.getTotalInStoreOrder(inStoreOrder);
        InStoreOrder expectedOrder = new InStoreOrder(1l, BigDecimal.valueOf(19.44), .10);
        assertThat(inStoreOrder).isEqualToComparingOnlyGivenFields(expectedOrder, "orderId", "finalPrice");
    }

    @Test
    public void shouldProcessFinalDifferentStateOnlineOrderThroughFacadeObject() {
        Order onlineOrder = new OnlineOrder(1L, BigDecimal.valueOf(20.0), .10, "MA", "NY");
        onlineOrder = orderReceipt.getTotalOnlineOrder(onlineOrder);
        OnlineOrder expectedOrder = createExpectedOnlineOrder(1L, BigDecimal.valueOf(26.44), .10, "MA", "NY", BigDecimal.valueOf(7.00));
        assertThat(onlineOrder).isEqualToComparingOnlyGivenFields(expectedOrder, "orderId", "finalPrice", "shippingCost");
    }

    public OnlineOrder createExpectedOnlineOrder(Long orderId, BigDecimal finalPrice, double coupon, String itemStateLocation, String customerStateLocation, BigDecimal shippingCost) {
        OnlineOrder onlineOrder = new OnlineOrder(orderId, finalPrice, coupon, itemStateLocation, customerStateLocation);
        onlineOrder.setShippingCost(shippingCost);
        return onlineOrder;
    }

}
