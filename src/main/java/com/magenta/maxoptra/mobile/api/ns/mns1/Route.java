package com.magenta.maxoptra.mobile.api.ns.mns1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "Route")
@XmlAccessorType(XmlAccessType.FIELD)
public class Route implements Serializable {

    @XmlElement(name = "Content", required = true)
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
