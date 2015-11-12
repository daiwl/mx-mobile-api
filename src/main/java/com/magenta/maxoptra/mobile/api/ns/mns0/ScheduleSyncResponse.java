package com.magenta.maxoptra.mobile.api.ns.mns0;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "SchSyncResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class ScheduleSyncResponse {

    @XmlElement(name = "Time", required = true)
    private Long time;

    @XmlElementWrapper(name = "Messages")
    @XmlElementRef
    private List<Message> messages;

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public List<? extends Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public void addMessage(Message message) {
        messages.add(message);
    }
}
