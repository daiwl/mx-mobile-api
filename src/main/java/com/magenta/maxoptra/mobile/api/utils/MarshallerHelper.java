package com.magenta.maxoptra.mobile.api.utils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MarshallerHelper {

    public static Object unmarshal(InputStream inputStream, Class... classes) throws JAXBException {
        return JAXBContext.newInstance(classes).createUnmarshaller().unmarshal(inputStream);
    }

    public static OutputStream marshal(Object object, Class... classes) throws JAXBException {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        JAXBContext.newInstance(classes).createMarshaller().marshal(object, os);
        return os;
    }


}
