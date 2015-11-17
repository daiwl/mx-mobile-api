package com.magenta.maxoptra.api.mobile.node.mns1;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement(name = "OrderState")
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderState implements Serializable {

    @XmlAttribute(name = "orderID", required = true)
    private Long orderID;

    @XmlElement(name = "Status", required = true)
    private String status;

    @XmlElementRef(required = false)
    private Position position;

    public OrderState() {
    }

    public OrderState(Long orderID, String status, Double lat, Double lon) {
        this.orderID = orderID;
        this.status = status;
        this.position = new Position(lat, lon);
    }

    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
