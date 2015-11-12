package com.magenta.maxoptra.mobile.api.ns.mns0;

import com.magenta.maxoptra.mobile.api.type.ActionType;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Message")
@XmlAccessorType(XmlAccessType.FIELD)
public class Message {

    @XmlElement(name = "Time", required = true)
    private Long time;

    @XmlElement(name = "Type")
    private ActionType type;

    @XmlAnyElement(lax = true)
    private Object objectInfo;

    @XmlElement(name = "Description")
    private String description;

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public ActionType getType() {
        return type;
    }

    public void setType(ActionType type) {
        this.type = type;
    }

    public Object getObjectInfo() {
        return objectInfo;
    }

    public void setObjectInfo(Object objectInfo) {
        this.objectInfo = objectInfo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
