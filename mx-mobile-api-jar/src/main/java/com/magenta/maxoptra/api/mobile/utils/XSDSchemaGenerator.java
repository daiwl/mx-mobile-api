package com.magenta.maxoptra.api.mobile.utils;


import com.magenta.maxoptra.api.mobile.node.mns0.MobileAPIRequest;
import com.magenta.maxoptra.api.mobile.node.mns0.MobileAPIResponse;
import com.magenta.maxoptra.api.mobile.node.mns1.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class XSDSchemaGenerator {

    public static void scheduleRequestXSD() throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(MobileAPIRequest.class, MobileAPIResponse.class,
                AuthRequest.class, AuthResponse.class, ScheduleRequest.class, ScheduleResponse.class, DynamicAttribute.class,
                Route.class, Order.class, OrderItem.class, OrderState.class, Position.class);
        SchemaOutputResolver sor = new MXSchemaOutputResolver();
        context.generateSchema(sor);
    }

    public static void scheduleResponseXSD() throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(Order.class, Run.class, MobileAPIRequest.class, MobileAPIResponse.class);
        SchemaOutputResolver sor = new MXSchemaOutputResolver();
        context.generateSchema(sor);
    }

    public static void authRequestXSD() throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(AuthRequest.class);
        SchemaOutputResolver sor = new MXSchemaOutputResolver();
        context.generateSchema(sor);
    }

    public static void authResponseXSD() throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(AuthResponse.class);
        SchemaOutputResolver sor = new MXSchemaOutputResolver();
        context.generateSchema(sor);
    }

    private static class MXSchemaOutputResolver extends SchemaOutputResolver {
        public Result createOutput(String namespaceURI, String suggestedFileName) throws IOException {
            File file = new File("/home/danil/" + suggestedFileName);
            StreamResult result = new StreamResult(file);
            result.setSystemId(file.toURI().toURL().toString());
            return result;
        }
    }
}
