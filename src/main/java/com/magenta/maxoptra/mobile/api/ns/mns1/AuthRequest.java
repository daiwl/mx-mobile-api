package com.magenta.maxoptra.mobile.api.ns.mns1;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement(name = "AuthRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class AuthRequest implements Serializable {

    @XmlElement(name = "Username", required = true)
    private String username;

    @XmlElement(name = "Password", required = true)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
