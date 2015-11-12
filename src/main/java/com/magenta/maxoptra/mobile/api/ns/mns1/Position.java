package com.magenta.maxoptra.mobile.api.ns.mns1;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Position")
@XmlAccessorType(XmlAccessType.FIELD)
public class Position {

    @XmlElement(name = "Lat", required = true)
    private Double lat;

    @XmlElement(name = "Lon", required = true)
    private Double lon;

    public Position() {
    }

    public Position(Double lat, Double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }
}
