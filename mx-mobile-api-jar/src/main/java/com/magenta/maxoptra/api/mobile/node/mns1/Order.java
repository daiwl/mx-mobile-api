package com.magenta.maxoptra.api.mobile.node.mns1;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "Order")
@XmlAccessorType(XmlAccessType.FIELD)
public class Order implements Serializable {

    @XmlAttribute(required = true)
    private Long id;

    @XmlElementWrapper(name = "OrderItems")
    @XmlElementRef(required = false)
    private List<OrderItem> orderItems = new ArrayList<>();;

    @XmlElementRef(required = false)
    private OrderState orderState;

    @XmlElementWrapper(name = "DynamicAttributes")
    @XmlElementRef(required = false)
    private List<DynamicAttribute> dynamicAttributes;

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

    public List<DynamicAttribute> getDynamicAttributes() {
        return dynamicAttributes;
    }

    public void setDynamicAttributes(List<DynamicAttribute> dynamicAttributes) {
        this.dynamicAttributes = dynamicAttributes;
    }
}
