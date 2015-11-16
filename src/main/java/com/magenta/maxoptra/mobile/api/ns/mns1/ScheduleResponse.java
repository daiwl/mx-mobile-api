package com.magenta.maxoptra.mobile.api.ns.mns1;

import com.magenta.maxoptra.mobile.api.ns.mns1.Run;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "ScheduleResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class ScheduleResponse implements Serializable {

    @XmlElement(name = "Date", required = true)
    private String date;

    @XmlElementWrapper(name = "Runs")
    @XmlElementRef(required = false)
    private List<Run> runs = new ArrayList<>();

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Run> getRuns() {
        return runs;
    }

    public void setRuns(List<Run> runs) {
        this.runs = runs;
    }
}
