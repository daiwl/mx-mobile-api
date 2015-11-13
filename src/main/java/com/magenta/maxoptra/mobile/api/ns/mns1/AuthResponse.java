package com.magenta.maxoptra.mobile.api.ns.mns1;

import com.magenta.maxoptra.mobile.api.type.AuthStatus;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AuthResponse")
public class AuthResponse {

    @XmlElement(name = "SessionID", required = true)
    private String sessionID;

    @XmlElement(name = "Status", required = true)
    private AuthStatus status;

    public AuthResponse() {
    }

    public AuthResponse(String sessionID, AuthStatus status) {
        this.sessionID = sessionID;
        this.status = status;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public AuthStatus getStatus() {
        return status;
    }

    public void setStatus(AuthStatus status) {
        this.status = status;
    }
}
