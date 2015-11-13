package com.magenta.maxoptra.mobile.api.rest.impl;

import com.magenta.maxoptra.mobile.api.ns.mns0.Message;
import com.magenta.maxoptra.mobile.api.ns.mns0.MobileAPIRequest;
import com.magenta.maxoptra.mobile.api.ns.mns0.MobileAPIResponse;
import com.magenta.maxoptra.mobile.api.ns.mns1.*;
import com.magenta.maxoptra.mobile.api.remote.MobileIntegrationLocalService;
import com.magenta.maxoptra.mobile.api.remote.MobileIntegrationRemoteService;
import com.magenta.maxoptra.mobile.api.rest.MobileScheduleAPI;
import com.magenta.maxoptra.mobile.api.utils.MarshallerHelper;
import com.sun.org.apache.xerces.internal.dom.ElementNSImpl;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

//import com.magenta.maxoptra.mobile.api.rest.MobileSecurityAPI;
//import com.sun.jersey.spi.container.ContainerRequest;

@Stateless
@Local(MobileScheduleAPI.class)
public class MobileIntegrationAPIImpl implements MobileScheduleAPI {

    @EJB
    MobileIntegrationRemoteService remoteService;

    @EJB
    MobileIntegrationLocalService localService;

    @Override
    public void sync(HttpServletRequest request, HttpServletResponse response) {
//        try {
//            OutputStream os = remoteService.pullMessage(request.getInputStream());
//            PrintWriter out = response.getWriter();
//            out.write(os.toString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        remoteService.pullMessage(request.getInputStream());
//        JAXBContext context = JAXBContext.newInstance(MobileAPIRequest.class, MobileAPIResponse.class);
//        JAXBContext context = null;
        try {
            MobileAPIRequest mobileAPIRequest = (MobileAPIRequest) MarshallerHelper.unmarshal(request.getInputStream(),
                    MobileAPIRequest.class, MobileAPIResponse.class);

            MobileAPIResponse mobileAPIResponse = remoteService.pullMessage(mobileAPIRequest);

            ElementNSImpl node = (ElementNSImpl) mobileAPIRequest.getMessages().get(0).getObjectInfo();
            JAXBContext nodectx = JAXBContext.newInstance(RunInfo.class);
            Object o = nodectx.createUnmarshaller().unmarshal(node);

//            ByteArrayOutputStream os = new ByteArrayOutputStream();
//            context.createMarshaller().marshal(response, os);
            System.out.print("ads");
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
        }


        MobileAPIResponse result = new MobileAPIResponse();
        result.setTime(123L);

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

        result.setMessages(new ArrayList<Message>());
        Message message = new Message();
        message.setTime(124L);
        message.setObjectInfo(runInfo);
        message.setDescription("Created by performer");
        result.addMessage(message);
        ByteArrayOutputStream os = new ByteArrayOutputStream();

//        try {
//            context.createMarshaller().marshal(result, os);
//            os.toString();
//        } catch (JAXBException e) {
//            e.printStackTrace();
//        }
//
//        return os.toString();
    }

//    @Override
//    public AuthResponse auth(AuthRequest requestRecord) throws JAXBException, IOException {
//        return new AuthResponse("sessID", AuthStatus.OK);
//    }
}
