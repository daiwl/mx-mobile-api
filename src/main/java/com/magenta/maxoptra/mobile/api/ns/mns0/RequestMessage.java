package com.magenta.maxoptra.mobile.api.ns.mns0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "Message")
@XmlAccessorType(XmlAccessType.FIELD)
public class RequestMessage extends Message implements Serializable {

    @XmlElement(name = "SessionID", required = false)
    private String sessionID;

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }
}
