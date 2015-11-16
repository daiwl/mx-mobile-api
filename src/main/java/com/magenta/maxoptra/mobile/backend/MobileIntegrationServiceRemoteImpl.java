package com.magenta.maxoptra.mobile.backend;

import com.magenta.maxoptra.mobile.api.ns.mns0.*;
import com.magenta.maxoptra.mobile.api.ns.mns1.*;
import com.magenta.maxoptra.mobile.api.remote.MobileIntegrationRemoteService;
import com.magenta.maxoptra.mobile.api.utils.MarshallerHelper;
import org.w3c.dom.Element;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import java.util.ArrayList;
import java.util.List;

@Stateless
@Remote(MobileIntegrationRemoteService.class)
public class MobileIntegrationServiceRemoteImpl implements MobileIntegrationRemoteService {

    @Override
    public MobileAPIResponse pullMessage(MobileAPIRequest request) {
        MobileAPIResponse result = new MobileAPIResponse();

        try {
            List<RequestMessage> messages =  request.getMessages();
            for (Message message : messages) {
                Object object = message.getObjectInfo();
                if (object instanceof Element) {
                    object = MarshallerHelper.unmarshal((Element)object, Run.class);
                }
            }

            result.setTime(123L);
            Run runInfo = new Run();
            runInfo.setDate("2015-10-10");
            runInfo.setSequence(1);

            runInfo.setOrders(new ArrayList<Order>());
            for (long i1 = 1; i1 < 4; i1++) {
                Order order = new Order();
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

            Route routeInfo = new Route();
            routeInfo.setContent("route");
            runInfo.setRouteInfo(routeInfo);

            result.setMessages(new ArrayList<ResponseMessage>());
            ResponseMessage message = new ResponseMessage();
            message.setTime(124L);
            message.setObjectInfo(MarshallerHelper.marshalToElement(runInfo, Run.class));
            message.setDescription("Created by performer");
            result.addMessage(message);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        return result;
    }

}
