package com.magenta.maxoptra.mobile.api.ns.mns0;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "AuthRequest")
public class AuthRequest {
    private String username;
    private String password;
    private String account;

    public String getUsername() {
        return username;
    }

    @XmlElement(name = "Username", required = true)
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    @XmlElement(name = "Password", required = true)
    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    @XmlElement(name = "Account", required = true)
    public void setAccount(String account) {
        this.account = account;
    }
}
