package com.magenta.maxoptra.mobile.api.ns.mns0;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import java.util.List;

@XmlTransient
public abstract class MessageTransferObject {

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

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public void addMessage(Message message) {
        messages.add(message);
    }
}
