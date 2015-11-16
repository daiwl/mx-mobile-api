package com.magenta.maxoptra.mobile.api.ns.mns1;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "Run")
@XmlAccessorType(XmlAccessType.FIELD)
public class Run implements Serializable {

    @XmlElement(name = "Date", required = true)
    private String date;

    @XmlElement(name = "Sequence", required = true)
    private Integer sequence;

    @XmlElementWrapper(name = "Orders", required = true)
    @XmlElementRef(required = false)
    private List<Order> orders = new ArrayList<>();

    @XmlElementRef(required = false)
    private Route routeInfo;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Route getRouteInfo() {
        return routeInfo;
    }

    public void setRouteInfo(Route routeInfo) {
        this.routeInfo = routeInfo;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }
}
