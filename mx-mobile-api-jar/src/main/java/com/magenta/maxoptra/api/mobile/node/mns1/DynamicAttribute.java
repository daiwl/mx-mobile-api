package com.magenta.maxoptra.api.mobile.node.mns1;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement(name = "DynamicAttribute")
@XmlAccessorType(XmlAccessType.FIELD)
public class DynamicAttribute implements Serializable {

    @XmlAttribute(required = true)
    private Long id;

    @XmlElement(name = "OwnerID", required = true)
    private Long ownerID;

    @XmlElement(name = "Name", required = true)
    private String name;

    @XmlElement(name = "Value", required = true)
    private String value;

    @XmlElement(name = "Type", required = true)
    private FieldType type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(Long ownerID) {
        this.ownerID = ownerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public FieldType getType() {
        return type;
    }

    public void setType(FieldType type) {
        this.type = type;
    }
}
