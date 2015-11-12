package com.magenta.maxoptra.mobile.api.ns.mns1;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "Order")
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderInfo {

    @XmlAttribute
    private Long id;

    @XmlElementWrapper(name = "OrderItems")
    @XmlElementRef(required = false)
    private List<OrderItem> orderItems;

    @XmlElementRef(required = false)
    private OrderState orderState;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public void addOrderItem(OrderItem orderItem) {
        orderItems.add(orderItem);
    }

    public OrderState getOrderState() {
        return orderState;
    }


    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }
}
