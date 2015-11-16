package com.magenta.maxoptra.mobile.api.ns.mns0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "Message")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResponseMessage extends Message implements Serializable {

    @XmlElement(name = "Type", required = false)
    private String type;

    @XmlElement(name = "Error", required = false)
    private MessageError error;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MessageError getError() {
        return error;
    }

    public void setError(MessageError error) {
        this.error = error;
    }

}
