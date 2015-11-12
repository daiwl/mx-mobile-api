package com.magenta.maxoptra.mobile.api.rest;

import com.magenta.maxoptra.mobile.api.ns.mns0.Message;
import com.magenta.maxoptra.mobile.api.ns.mns0.ScheduleSyncRequest;
import com.magenta.maxoptra.mobile.api.ns.mns0.ScheduleSyncResponse;
import com.magenta.maxoptra.mobile.api.ns.mns1.*;
import com.magenta.maxoptra.mobile.api.utils.XSDSchemeGenerator;
import com.sun.jersey.spi.container.ContainerRequest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

@Path("schedule")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
public class MobileScheduleAPI {

    @POST
    @Path("/sync")
    public String sync(@Context Request request) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(OrderInfo.class, RunInfo.class, ScheduleSyncRequest.class, ScheduleSyncResponse.class);
        ScheduleSyncRequest object = (ScheduleSyncRequest) context.createUnmarshaller().unmarshal(((ContainerRequest) request).getEntityInputStream());
        XSDSchemeGenerator.scheduleResponseXSD();

        ScheduleSyncResponse response = new ScheduleSyncResponse();
        response.setTime(123L);

        RunInfo runInfo = new RunInfo();
        runInfo.setId("2015-10-10-1");

        runInfo.setOrders(new ArrayList<OrderInfo>());
        for (long i1 = 1; i1 < 4; i1++) {
            OrderInfo order = new OrderInfo();
            order.setId(i1);

            order.setOrderItems(new ArrayList<OrderItem>());
            for (long i2 = 1; i2 < 3; i2++) {
                OrderItem orderItem = new OrderItem();
                orderItem.setId(i2);
                orderItem.setOrderID(i1);
                order.addOrderItem(orderItem);
            }

            order.setOrderState(new OrderState(i1, "ALLOCATED", 123D, 321D));
            runInfo.addOrder(order);
        }

        RouteInfo routeInfo = new RouteInfo();
        routeInfo.setContent("route");
        runInfo.setRouteInfo(routeInfo);

        response.setMessages(new ArrayList<Message>());
        Message message = new Message();
        message.setTime(124L);
        message.setObjectInfo(runInfo);
        message.setDescription("Created by performer");
        response.addMessage(message);
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        context.createMarshaller().marshal(response, os);

        return os.toString();
    }

}
