package com.magenta.maxoptra.api.mobile.utils;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.InputStream;
import java.io.OutputStream;

public class MarshallerHelper {

    public static Object unmarshal(InputStream inputStream, Class... classes) throws JAXBException {
        return JAXBContext.newInstance(classes).createUnmarshaller().unmarshal(inputStream);
    }

    public static Object unmarshal(Element element, Class... classes) throws JAXBException {
        return JAXBContext.newInstance(classes).createUnmarshaller().unmarshal(element);
    }

    public static void marshalToOS(Object object, OutputStream os, Class... classes) throws JAXBException {
        JAXBContext.newInstance(classes).createMarshaller().marshal(object, os);
    }

    public static Element marshalToElement(Object object, Class... classes) throws JAXBException, ParserConfigurationException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        Document doc = dbf.newDocumentBuilder().newDocument();
        JAXBContext.newInstance(classes).createMarshaller().marshal(object, doc);
        return doc.getDocumentElement();
    }
}
