package com.magenta.maxoptra.mobile.api.ns.mns0;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

@XmlRootElement(name = "MobileAPIRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class MobileAPIRequest implements Serializable {

    @XmlElement(name = "Time", required = true)
    private Long time;

    @XmlElementWrapper(name = "Messages", required = true)
    @XmlElementRef
    private List<RequestMessage> messages;

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public List<RequestMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<RequestMessage> messages) {
        this.messages = messages;
    }

    public void addMessage(RequestMessage message) {
        messages.add(message);
    }
}
