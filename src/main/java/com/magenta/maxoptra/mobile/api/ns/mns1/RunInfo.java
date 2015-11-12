package com.magenta.maxoptra.mobile.api.ns.mns1;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "Run")
@XmlAccessorType(XmlAccessType.FIELD)
public class RunInfo {

    @XmlAttribute(name = "id", required = true)
    private String id;

    @XmlElementWrapper(name = "Orders")
    @XmlElementRef(required = false)
    private List<OrderInfo> orders;

    @XmlElementRef(required = false)
    private RouteInfo routeInfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<OrderInfo> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderInfo> orders) {
        this.orders = orders;
    }

    public RouteInfo getRouteInfo() {
        return routeInfo;
    }

    public void setRouteInfo(RouteInfo routeInfo) {
        this.routeInfo = routeInfo;
    }

    public void addOrder(OrderInfo order) {
        orders.add(order);
    }
}
