package com.magenta.maxoptra.mobile.api.ns.mns1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "ScheduleRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class ScheduleRequest implements Serializable {

    @XmlElement(name = "Date", required = true)
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
