package com.magenta.maxoptra.mobile.api.utils;

import com.magenta.maxoptra.mobile.api.ns.mns0.AuthRequest;
import com.magenta.maxoptra.mobile.api.ns.mns0.AuthResponse;
import com.magenta.maxoptra.mobile.api.ns.mns0.ScheduleSyncRequest;
import com.magenta.maxoptra.mobile.api.ns.mns0.ScheduleSyncResponse;
import com.magenta.maxoptra.mobile.api.ns.mns1.OrderInfo;
import com.magenta.maxoptra.mobile.api.ns.mns1.RunInfo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class XSDSchemeGenerator {

    public static void scheduleResponseXSD() throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(OrderInfo.class, RunInfo.class, ScheduleSyncRequest.class, ScheduleSyncResponse.class);
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
