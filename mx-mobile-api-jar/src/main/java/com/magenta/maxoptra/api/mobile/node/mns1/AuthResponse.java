package com.magenta.maxoptra.api.mobile.node.mns1;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "AuthResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class AuthResponse implements Serializable {

    @XmlElement(name = "SessionID", required = true)
    private String sessionID;

    public AuthResponse() {
    }

    public AuthResponse(String sessionID) {
        this.sessionID = sessionID;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }
}
