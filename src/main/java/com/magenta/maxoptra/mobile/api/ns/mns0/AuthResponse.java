package com.magenta.maxoptra.mobile.api.ns.mns0;

import com.magenta.maxoptra.mobile.api.type.AuthStatus;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AuthResponse")
public class AuthResponse {
    private String sessionID;
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

    @XmlElement(name = "SessionID", required = true)
    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public AuthStatus getStatus() {
        return status;
    }

    @XmlElement(name = "Status", required = true)
    public void setStatus(AuthStatus status) {
        this.status = status;
    }
}
