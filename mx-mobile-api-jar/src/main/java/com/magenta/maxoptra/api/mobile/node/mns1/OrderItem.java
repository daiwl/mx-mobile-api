package com.magenta.maxoptra.api.mobile.node.mns1;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement(name = "OrderItem")
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderItem implements Serializable {

    @XmlAttribute(name = "id")
    private Long id;

    @XmlElement(name = "OrderID")
    private Long orderID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }
}
