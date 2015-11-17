package com.magenta.maxoptra.api.mobile.node.mns0;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

@XmlRootElement(name = "MobileAPIResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class MobileAPIResponse implements Serializable {

    @XmlElement(name = "Time", required = true)
    private Long time;

    @XmlElementWrapper(name = "Messages", required = true)
    @XmlElementRef
    private List<ResponseMessage> messages;

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public List<ResponseMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<ResponseMessage> messages) {
        this.messages = messages;
    }

    public void addMessage(ResponseMessage message) {
        messages.add(message);
    }
}
