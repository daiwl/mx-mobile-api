package com.magenta.maxoptra.api.mobile.node.mns1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
